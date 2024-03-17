package com.microservice.consumer_queue.services;

import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
public class Teste {
    @Autowired
    MessageProcessing converterService;
    @PostMapping("/something")
    public String createUser(@RequestBody Notfis source){
        converterService.converteRequest(source);
        return "ok";
    }

}
