package com.luojianwu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.luojianwu.cms.pojo.User;

public interface UserDao {
	
	@Select(" select *from cms_user")
	List<User> list();

	
	
}
