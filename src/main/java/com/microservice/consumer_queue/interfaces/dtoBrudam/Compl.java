package com.microservice.consumer_queue.interfaces.dtoBrudam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Compl {
  private RespColeta respEntrega;
  private RespColeta respColeta;
}