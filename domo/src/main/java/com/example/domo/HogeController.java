package com.example.domo;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hoge")
@Singleton
public class HogeController {
    
    @GET
    public String hoge(){
        return "hoge!, world!!";
    }
}
