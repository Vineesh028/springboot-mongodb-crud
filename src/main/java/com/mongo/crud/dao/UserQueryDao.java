package com.mongo.crud.dao;

import java.util.List;

import com.mongo.crud.model.User;

public interface UserQueryDao {

	List<User> getUserByName(String name);

	User getOneUserByName(String name);

	List<User> getUserByNameLike(String name);

}
