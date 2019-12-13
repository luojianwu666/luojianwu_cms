package com.luojianwu.cms.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class adminController {
	
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "admin/welcome";
	}
	
	
	
	@RequestMapping("/article")
	public String article() {
		return "admin/article";
	}
	
	@RequestMapping("/settings")
	public String settings() {
		return "admin/settings";
	}
	
}
