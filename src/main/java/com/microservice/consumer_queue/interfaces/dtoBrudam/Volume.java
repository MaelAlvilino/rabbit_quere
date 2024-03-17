package com.microservice.consumer_queue.interfaces.dtoBrudam;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Volume {
  private long dCOM;
  private long dLar;
  private long dAlt;
  private long qVol;
  private long pBru;
  private long pCub;
  private String cEtiq;
}