package com.applcation.cleanApp.repository;

import  com.applcation.cleanApp.user.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
public interface userRepository extends MongoRepository<user, String>{
    boolean existsByAutoUsername(String autoUsername);
    user findByPhoneNumber(String phoneNumber);
    boolean existsByPhoneNumber(String phoneNumber);
}
