package com.mongo.crud.service;

import java.util.List;

import com.mongo.crud.model.User;

public interface UserQueryService {

	List<User> getUserByName(String name);

	User getOneUserByName(String name);

	List<User> getUserByNameLike(String name);

}
