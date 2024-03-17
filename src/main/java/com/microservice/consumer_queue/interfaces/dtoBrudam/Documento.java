package com.microservice.consumer_queue.interfaces.dtoBrudam;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Documento {
  private String nPed;
  private String serie;
  private String nDoc;
  private String dEmi;
  private long vBC;
  private long vICMS;
  private long vBCST;
  private long vST;
  private long vProd;
  private long vNF;
  private long nCFOP;
  private long pBru;
  private long qVol;
  private long pin;
  private String chave;
  private String tpDoc;
  private String xEsp;
  private String xNat;
}