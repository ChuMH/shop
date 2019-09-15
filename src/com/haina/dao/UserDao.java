package com.haina.dao;

import com.haina.domain.User;

public interface UserDao {
	void register(User user);
	User login(User user);
}
