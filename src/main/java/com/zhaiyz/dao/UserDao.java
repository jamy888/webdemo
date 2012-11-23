package com.zhaiyz.dao;

import java.util.List;

import com.zhaiyz.vo.User;

public interface UserDao {

	int insert(User user);
	
	List<User> select(User user);
}
