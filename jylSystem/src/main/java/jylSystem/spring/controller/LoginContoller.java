package jylSystem.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContoller {

	@RequestMapping(value="/logout")
	public String logout()
	{
		return "login/logout";
	}
}
