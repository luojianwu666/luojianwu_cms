package com.luojianwu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article/")
public class ArticleController {
	
	
	@RequestMapping("add")
	public Object add() {
		
		return "article/add";
	}
	
	
}
