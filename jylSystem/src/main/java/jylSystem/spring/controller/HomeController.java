package jylSystem.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home()
	{
		return "login/login-page";
	}
	
	@RequestMapping(value="/layout/front", method = RequestMethod.GET)
	public String front()
	{
		return "layouts/front.tiles";
	}
}
