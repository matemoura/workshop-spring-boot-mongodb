package com.moura.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moura.course.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
