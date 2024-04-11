package com.barsha.userchatgraphql.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barsha.userchatgraphql.Model.Table;

@Repository
public interface UserMessege extends MongoRepository<Table, String>{
    
}
