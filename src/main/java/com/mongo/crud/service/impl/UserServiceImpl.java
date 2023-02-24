package com.mongo.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.crud.model.User;
import com.mongo.crud.repository.UserRepository;
import com.mongo.crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User createUser(User user) {

		return repository.save(user);
	}

	@Override
	public List<User> getAll() {

		return repository.findAll();
	}

	@Override
	public User getUserById(String id) {

		return repository.findById(id).get();
	}

	@Override
	public List<User> getUserByName(String name) {

		return repository.findByName(name);
	}

	@Override
	public List<User> getUserByNickName(String nickname) {

		return repository.findByNickName(nickname);
	}

	@Override
	public User updateUser(String id, User user) {
		User existingUser = repository.findById(id).get();
		existingUser.setName(user.getName());
		existingUser.setNickName(user.getNickName());
		existingUser.setEmail(user.getEmail());
		return repository.save(existingUser);

	}

	@Override
	public void deleteUser(String id) {

		repository.deleteById(id);

	}

	@Override
	public void deleteAllUsers() {
		repository.deleteAll();
	}
}
