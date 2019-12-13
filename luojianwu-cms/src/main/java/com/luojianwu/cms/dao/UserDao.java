package com.luojianwu.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.PageInfo;
import com.luojianwu.cms.pojo.User;

public interface UserDao {
	
	@Select(" select *from cms_user")
	List<User> list();
	
	
	List<User> queryUser(User user);

	
	
	
}
