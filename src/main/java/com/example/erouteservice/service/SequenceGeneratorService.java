package com.example.erouteservice.service;

import com.example.erouteservice.entity.DatabaseSequance;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;


import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
@Service
public class SequenceGeneratorService {

    @Autowired
    private MongoOperations mongoOperations;


    public long generateSequence(String seqName) {

        DatabaseSequance counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                DatabaseSequance.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;

    }
}
