package com.example.erouteservice.service;

import com.example.erouteservice.model.Route;
import com.example.erouteservice.repo.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;
    @Override
    public Route createRoute(Route route) {



        com.example.erouteservice.entity.Route routeE =routeRepository.save(com.example.erouteservice.entity.Route.builder()
                        .routeId(sequenceGeneratorService.generateSequence("users_sequence"))
                .source(route.getSource())
                .destination(route.getDestination())
                .stops(route.getStops()).build());

        return Route.builder()
                .routeID(routeE.getRouteId())
                .source(routeE.getSource())
                .destination(routeE.getDestination())
                .stops(routeE.getStops())
                .build();
    }

    @Override
    public List<Route> findRoutes() {
        List<com.example.erouteservice.entity.Route> response= routeRepository.findAll();

        return response.stream().map((entity)->{
          return   Route.builder().routeID(entity.getRouteId())
                  .source(entity.getSource())
                  .destination(entity.getDestination())
                  .stops(entity.getStops())
                  .build();
        }).toList();
    }
}
