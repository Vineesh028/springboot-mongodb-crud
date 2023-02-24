package com.mongo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.model.User;
import com.mongo.crud.service.UserQueryService;


@RestController
@RequestMapping("/api/users/query")
public class UserQueryController {
	
	@Autowired
	private UserQueryService userQueryService;
	
	
    @GetMapping("/name/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return userQueryService.getUserByName(name);
    }


    @GetMapping("/one-by-name/{name}")
    public User getOneUserByName(@PathVariable String name) {
        return userQueryService.getOneUserByName(name);
    }


    @GetMapping("/name-like/{name}")
    public List<User> getUserByNameLike(@PathVariable String name) {
        return userQueryService.getUserByNameLike(name);
    }



}
