package com.microservice.consumer_queue.interfaces.dtoBrudam;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coleta {
  private long toma;
  private String nDocEmit;
  private LocalDate dEmi;
  private String xSoli;
  private String telefoneSoli;
  private String hIni;
  private String hFim;
  private long rSeg;
  private String cSeg;
  private LocalDate dColeta;
  private LocalDate dColetaLim;
  private String cServ;
  private String cAut;
  private Carga carga;
  private Volume[] volumes;

  private long cStatus;
}
