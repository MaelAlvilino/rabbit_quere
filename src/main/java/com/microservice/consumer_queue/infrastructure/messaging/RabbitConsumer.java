package com.microservice.consumer_queue.infrastructure.messaging;
import java.util.function.Consumer;

import com.microservice.consumer_queue.services.MessageProcessing;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RabbitConsumer implements Consumer<Notfis> {
  private final MessageProcessing messageProcessing;

  @Override
  public void accept(Notfis source) {
    messageProcessing.converteRequest(source);
  }
}