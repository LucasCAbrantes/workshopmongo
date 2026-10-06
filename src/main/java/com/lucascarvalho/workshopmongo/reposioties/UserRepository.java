package com.lucascarvalho.workshopmongo.reposioties;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucascarvalho.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
