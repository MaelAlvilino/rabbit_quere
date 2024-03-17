package com.microservice.consumer_queue.interfaces.dtoBrudam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespColeta {
  private long tpResp;
  private String nDoc;
}
