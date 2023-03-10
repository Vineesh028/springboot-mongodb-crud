package com.mongo.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.crud.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);
    List<User> findByNickName(String nickName);
}
