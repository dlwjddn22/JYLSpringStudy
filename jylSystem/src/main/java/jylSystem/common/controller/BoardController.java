package jylSystem.common.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jylSystem.mybatis.service.SQLService;
 
@Controller
public class BoardController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Autowired
    private SQLService sqlService;

    @RequestMapping(value="/board/BoardList.do")
    public ModelAndView BoardList(@RequestParam int useId, Principal principal) throws Exception{//Map<String, Object> paramMa
        ModelAndView mv = new ModelAndView("board/boardList.tiles");
        
        //System.out.println("useId:"+paramMap.get("useId"));
         
        String name = principal.getName();
        List<Map<String,Object>> list = sqlService.selectBoardList(useId);
        
		mv.addObject("name", name);
        mv.addObject("list", list);
         
        return mv;
    }
}