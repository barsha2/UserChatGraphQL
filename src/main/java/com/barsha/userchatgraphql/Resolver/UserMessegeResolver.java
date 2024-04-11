package com.barsha.userchatgraphql.Resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barsha.userchatgraphql.Model.Table;
import com.barsha.userchatgraphql.Repository.UserMessege;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserMessegeResolver implements GraphQLQueryResolver{
    
    @Autowired(required =  true)
    private UserMessege userMessege;

    public UserMessegeResolver() {
        this.userMessege = userMessege;
    }


    public Iterable<Table> findAllAuthors() {
        return userMessege.findAll();
    }
}
