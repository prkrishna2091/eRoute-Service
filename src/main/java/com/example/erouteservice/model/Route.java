package com.example.erouteservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Route  {

    @JsonProperty("route_id")
    private Long routeID;

    @JsonProperty("from")
    private String source;

    @JsonProperty("to")
    private String destination;

    @JsonProperty("stops")
    private HashMap<String,String> stops;
}
