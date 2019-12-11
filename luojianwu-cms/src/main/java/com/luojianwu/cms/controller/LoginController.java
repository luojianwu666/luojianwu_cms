package com.luojianwu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping("login.do")
	public Object login() {
		return "login";
	}
	
	
	
}
