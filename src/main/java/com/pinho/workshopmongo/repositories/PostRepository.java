package com.pinho.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pinho.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}