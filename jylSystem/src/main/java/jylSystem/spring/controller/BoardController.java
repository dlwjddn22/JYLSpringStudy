package jylSystem.spring.controller;

import java.security.Principal;

import jylSystem.mybatis.dao.BoardDao;
import jylSystem.vo.BoardBean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value = "/board/boardList")
	public ModelAndView boardList(Principal principal) {// Map<String, Object>
														// paramMa
		ModelAndView mv = new ModelAndView("board/boardList.tiles");

		String name = principal.getName();
		mv.addObject("name", name);
		mv.addObject("count", boardDao.getBoardCount());
		mv.addObject("list", boardDao.selectBoardList());
		
		return mv;
	}

	@RequestMapping(value = "/board/boardWrite")
	public String boardWrite() {
		return "board/boardWrite.tiles";

	}

	@RequestMapping(value = "/board/boardInsert", method = RequestMethod.POST)
	public String boardInsert(BoardBean boardBean) {
		boardDao.boardInsert(boardBean);
		return "redirect:/board/boardList";
	}

	@RequestMapping(value = "/board/boardModify", method = RequestMethod.GET)
	public String boardModify(@RequestParam String usr_id, Model model) {
		BoardBean boardBean = boardDao.boardModify(usr_id);
		model.addAttribute("boardBean", boardBean);
		return "board/boardModify.tiles";
	}

	@RequestMapping(value = "/board/boardUpdate", method = RequestMethod.POST)
	public String boardUpdate(BoardBean boardBean) {
		boardDao.boardUpdate(boardBean);
		return "redirect:/board/boardList";
	}

	@RequestMapping(value = "/board/boardDelete", method = RequestMethod.GET)
	public String boardDelete(@RequestParam String usr_id) {
		boardDao.boardDelete(usr_id);
		return "redirect:/board/boardList";
	}

}