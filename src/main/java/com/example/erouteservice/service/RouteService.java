package com.example.erouteservice.service;

import com.example.erouteservice.model.Route;

import java.util.List;

public interface RouteService {

    public Route createRoute(Route route);

    public List<Route> findRoutes();
}
