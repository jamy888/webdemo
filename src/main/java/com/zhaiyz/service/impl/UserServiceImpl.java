package com.zhaiyz.service.impl;

import java.util.List;

import com.zhaiyz.dao.UserDao;
import com.zhaiyz.service.UserService;
import com.zhaiyz.vo.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int doRegister(User user) {
		return userDao.insert(user);
	}

	@Override
	public User login(User user) {
		List<User> list = userDao.select(user);
		if (list == null || list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

}
