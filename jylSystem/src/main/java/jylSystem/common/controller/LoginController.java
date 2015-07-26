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
public class LoginController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="SQLService")
    private SQLService SQLService;

    @RequestMapping(value="/global/login_action.do")
    public ModelAndView BoardList(Map<String, Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("global/login_action.tiles");

        System.out.println("진입");
        return mv;
    }
}