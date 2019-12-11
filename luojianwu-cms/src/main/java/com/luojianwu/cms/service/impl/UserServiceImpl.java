package com.luojianwu.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luojianwu.cms.dao.UserDao;
import com.luojianwu.cms.pojo.User;
import com.luojianwu.cms.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}
}
