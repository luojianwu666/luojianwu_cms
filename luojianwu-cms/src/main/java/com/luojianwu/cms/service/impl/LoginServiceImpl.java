package com.luojianwu.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luojianwu.cms.dao.LoginDao;
import com.luojianwu.cms.dao.UserDao;
import com.luojianwu.cms.pojo.User;
import com.luojianwu.cms.service.LoginService;
import com.luojianwu.cms.service.UserService;

@Transactional
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	@Override
	public boolean tologin(User user) {
		// TODO Auto-generated metho d stub
		int i=loginDao.tologin(user);
		System.out.println(i+"****************");
		if(i>0) {
			return true;
		}else {
			return false;
		}
	}

	

	
}
