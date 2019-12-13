package com.luojianwu.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.luojianwu.cms.pojo.User;

public interface UserService {

	List<User> list();

	PageInfo<User> queryUser(User user);

}
