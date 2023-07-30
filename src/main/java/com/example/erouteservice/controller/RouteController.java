package com.example.erouteservice.controller;

import com.example.erouteservice.model.Route;
import com.example.erouteservice.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eroute-api")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @PostMapping("/create")
    public ResponseEntity<Route> createRoute(@RequestBody  Route route){
          Route response =  routeService.createRoute(route);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/routes")
    public ResponseEntity<List<Route>> findRoutes(){
       List<Route> listOfRoutes = routeService.findRoutes();

       return new ResponseEntity<>(listOfRoutes,HttpStatus.FOUND);
    }
}
