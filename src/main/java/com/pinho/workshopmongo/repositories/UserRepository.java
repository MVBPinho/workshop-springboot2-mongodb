package com.pinho.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pinho.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}