package com.microservice.consumer_queue.interfaces.dtoBrudam;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dest {
  private String nDoc;
  private String ie;
  private String xNome;
  private String xFant;
  private String nFone;
  private String isuf;
  private String xLgr;
  private String nro;
  private String xCpl;
  private String xBairro;
  private String cMun;
  private String cep;
  private String cPais;
  private String email;
}
