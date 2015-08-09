package jylSystem.common.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
