package com.luojianwu.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luojianwu.cms.pojo.User;
import com.luojianwu.cms.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public Object home() {
		return "admin/home";
	}
	
	@RequestMapping("/user")
	public String user(User user,Model m,@RequestParam(value="pageNum",defaultValue="1") int pageNum,
			@RequestParam(value="pageSize",defaultValue="3") int pageSize
			) {
		System.out.println(user+"5555555555555555555555");
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<User> pageInfo=userService.queryUser(user);
		m.addAttribute("pageInfo", pageInfo);

		return "admin/user";
	}
}
