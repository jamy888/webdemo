package com.zhaiyz.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhaiyz.service.UserService;
import com.zhaiyz.vo.User;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -9097323582138066933L;

	private UserService userService;

	private User user;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String register() {
		userService.doRegister(user);
		return SUCCESS;
	}

	public String login() {
		User u = userService.login(getUser());
		setUser(u);
		return u == null ? ERROR : SUCCESS;
	}
}
