package com.microservice.consumer_queue.interfaces.dtoBrudam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Carga {
  private long pBru;
  private long pCub;
  private long qVol;
  private long vTot;

}
