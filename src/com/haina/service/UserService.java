package com.haina.service;

import com.haina.domain.User;

public interface UserService {
	void register(User user);
	User login(User user);
}
