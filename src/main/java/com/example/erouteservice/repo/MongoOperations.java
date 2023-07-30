package com.example.erouteservice.repo;

import com.example.erouteservice.entity.DatabaseSequance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoOperations extends MongoRepository<DatabaseSequance,String> {
}
