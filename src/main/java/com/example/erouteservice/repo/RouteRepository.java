package com.example.erouteservice.repo;

import com.example.erouteservice.entity.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route,String> {
}
