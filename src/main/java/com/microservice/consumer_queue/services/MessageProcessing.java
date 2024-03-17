package com.microservice.consumer_queue.services;

import com.microservice.consumer_queue.infrastructure.converter.ConsumerConverter;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import com.microservice.consumer_queue.infrastructure.external.BrudamService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessing {

  @Autowired
  private ConsumerConverter converter;
  @Autowired
  private BrudamService brudamService;
  public void converteRequest(Notfis source){
    var converting =  converter.convert(source);
    this.brudamService.coleta(converting);
  }
}



