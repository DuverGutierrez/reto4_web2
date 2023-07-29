package com.example.Reto4SpringBootMongoDB.Repository;

import com.example.Reto4SpringBootMongoDB.Entity.Gadget;
import com.example.Reto4SpringBootMongoDB.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    List<User> findByMonthBirthtDayMatches(String month);

}