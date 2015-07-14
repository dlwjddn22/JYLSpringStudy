package jylSystem.common.controller;

import java.util.List;
import java.util.Map;
 


import javax.annotation.Resource;
 


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jylSystem.mybatis.service.SQLService;
 
@Controller
public class BoardController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="SQLService")
    private SQLService SQLService;

    @RequestMapping(value="/board/BoardList.do")
    public ModelAndView BoardList(Map<String, Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/board/boardList");
         
        List<Map<String,Object>> list = SQLService.selectBoardList(commandMap);
        mv.addObject("list", list);
         
        return mv;
    }
}