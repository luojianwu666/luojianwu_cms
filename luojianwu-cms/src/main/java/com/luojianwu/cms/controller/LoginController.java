package com.luojianwu.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luojianwu.cms.pojo.User;
import com.luojianwu.cms.service.LoginService;
import com.luojianwu.cms.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping("/")
	public Object login() {
		return "login";
	}
	
	@ResponseBody
	@RequestMapping("tologin.do")
	public Object tologin(User user) {
		
		boolean flag=loginService.tologin(user);
		
		
		return flag;
	}
	
}
