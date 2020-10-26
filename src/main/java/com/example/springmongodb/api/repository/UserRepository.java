package com.example.springmongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springmongodb.api.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
