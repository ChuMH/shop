package com.haina.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haina.dao.UserDao;
import com.haina.domain.User;
import com.haina.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao udao;
	public void register(User user) {
		System.out.println(user);
		udao.register(user);
	}
	public User login(User user) {
		return udao.login(user);
	}

}
