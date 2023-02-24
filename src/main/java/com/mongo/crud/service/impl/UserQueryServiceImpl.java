package com.mongo.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.crud.dao.UserQueryDao;
import com.mongo.crud.model.User;
import com.mongo.crud.service.UserQueryService;

@Service
public class UserQueryServiceImpl implements UserQueryService {

	@Autowired
	private UserQueryDao userQueryDao;

	@Override
	public List<User> getUserByName(String name) {
		if (!name.isBlank()) {
			return userQueryDao.getUserByName(name);
		}

		return null;

	}

	@Override
	public User getOneUserByName(String name) {
		if (!name.isBlank()) {
			return userQueryDao.getOneUserByName(name);
		}

		return null;

	}

	@Override
	public List<User> getUserByNameLike(String name) {
		if (!name.isBlank()) {
			return userQueryDao.getUserByNameLike(name);
		}

		return null;
	}

}
