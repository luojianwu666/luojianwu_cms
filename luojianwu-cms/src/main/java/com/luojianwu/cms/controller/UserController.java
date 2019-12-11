package com.luojianwu.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luojianwu.cms.service.UserService;

@Controller
@RequestMapping("/login/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
}
