package com.example.erouteservice.entity;

import com.example.erouteservice.service.SequenceGeneratorService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.UUID;

@Document(collection = "routes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Route {



    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long routeId ;

    private String source;

    private String destination;

    private HashMap<String,String> stops;
}
