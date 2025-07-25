package com.inner_code.repository;

import com.inner_code.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String>  {
    boolean existsByEmail(String email);
}
