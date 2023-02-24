package com.mongo.crud.service;

import java.util.List;

import com.mongo.crud.model.User;

public interface UserService {

	User createUser(User user);

	List<User> getAll();

	User getUserById(String id);

	List<User> getUserByName(String name);

	List<User> getUserByNickName(String nickname);

	User updateUser(String id, User user);

	void deleteUser(String id);

	void deleteAllUsers();

}
