package com.luojianwu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.luojianwu.cms.pojo.User;

public interface LoginDao {

	@Select(" select COUNT(*) from cms_user where username=#{username} and password=#{password}")
	int tologin(User user);

	
	
}
