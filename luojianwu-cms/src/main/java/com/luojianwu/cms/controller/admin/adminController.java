package com.luojianwu.cms.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class adminController {
	
	
	@RequestMapping("/")
	public String admin() {
		
		return "";
	}
	
	
	
}
