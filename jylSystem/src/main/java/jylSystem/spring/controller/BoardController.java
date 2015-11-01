package jylSystem.spring.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jylSystem.bean.BoardBean;
import jylSystem.mybatis.service.SQLService;
 
@Controller
public class BoardController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Autowired
    private SQLService sqlService;

    @RequestMapping(value="/board/boardList")
    public ModelAndView boardList(Principal principal) {//Map<String, Object> paramMa
        ModelAndView mv = new ModelAndView("board/boardList.tiles");        
         
        String name = principal.getName();
        List<Map<String,Object>> list = sqlService.selectBoardList();
        int count = sqlService.getBoardCount();
        
		mv.addObject("name", name);
		mv.addObject("count", count);
		mv.addObject("list", list);
        
        return mv;
    }
    @RequestMapping(value="/board/boardWrite")
    public String boardWrite() {
        return "board/boardWrite.tiles";
        
    }
    @RequestMapping(value="/board/boardInsert", method = RequestMethod.POST )
    public String boardInsert(BoardBean boardBean) {
    	sqlService.boardInsert(boardBean);
        return "redirect:/board/boardList";
    }
    
    @RequestMapping(value="/board/boardModify", method=RequestMethod.GET)
    public String boardModify(@RequestParam String usr_id, Model model) {
    	  
    	BoardBean boardBean = sqlService.boardModify(usr_id);
    	model.addAttribute("boardBean", boardBean);
    	
        return "board/boardModify.tiles";
    }
    @RequestMapping(value="/board/boardUpdate", method = RequestMethod.POST )
    public String boardUpdate(BoardBean boardBean) {
    	sqlService.boardUpdate(boardBean);
        return "redirect:/board/boardList";
    }
    @RequestMapping(value="/board/boardDelete", method = RequestMethod.GET )
    public String boardDelete(@RequestParam String usr_id) {
    	sqlService.boardDelete(usr_id);
    	return "redirect:/board/boardList";
    }    
    
}