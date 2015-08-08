package jylSystem.common.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jylSystem.mybatis.service.LoginService;

@Controller
public class LoginController {	
	
	@RequestMapping("/login.do")
	public ModelAndView login(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		 ModelAndView mv = new ModelAndView("login/login.gb");
		 return mv;
	}
	
	@RequestMapping("/loginFail.do")
	public ModelAndView loginFail(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		 ModelAndView mv = new ModelAndView("login/loginFail.gb");
		 return mv;
	}
	
	
	@RequestMapping("/logout.do")
	public ModelAndView logout(@RequestParam Map<String, Object> paramMap, ModelMap model) throws Throwable{
		 ModelAndView mv = new ModelAndView("login/logout.gb");
		 return mv;
	}

}
