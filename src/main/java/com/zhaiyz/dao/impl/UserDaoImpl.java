package com.zhaiyz.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zhaiyz.dao.UserDao;
import com.zhaiyz.vo.User;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

	@Override
	public int insert(User user) {
		return (Integer) getSqlMapClientTemplate().insert("com.zhaiyz.vo.user.insert", user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> select(User user) {
		return (List<User>) getSqlMapClientTemplate().queryForList("com.zhaiyz.vo.user.select", user);
	}

}
