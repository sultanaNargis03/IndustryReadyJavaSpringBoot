package com.telusko.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>
{

}
