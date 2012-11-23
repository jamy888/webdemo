package com.zhaiyz.service;

import com.zhaiyz.vo.User;

public interface UserService {

	int doRegister(User user);

	User login(User user);
}
