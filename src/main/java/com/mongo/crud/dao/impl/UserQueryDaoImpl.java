package com.mongo.crud.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongo.crud.dao.UserQueryDao;
import com.mongo.crud.model.User;
import com.mongo.crud.util.Constant;

@Repository
public class UserQueryDaoImpl implements UserQueryDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<User> getUserByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where(Constant.NAME).is(name));
		return new ArrayList<>(mongoTemplate.find(query, User.class));
	}

	@Override
	public User getOneUserByName(String name) {

		Query query = new Query();
		query.addCriteria(Criteria.where(Constant.NAME).is(name));

		return mongoTemplate.findOne(query, User.class);
	}

	@Override
	public List<User> getUserByNameLike(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where(Constant.NAME).regex(name, Constant.REGEX_CASE_INSENSITIVE));

		return mongoTemplate.find(query, User.class);
	}

}
