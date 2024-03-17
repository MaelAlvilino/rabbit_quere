package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValoresTotaisDocumento {
  private String identificador_de_registro;
  private long valor_total_das_notas;
  private long peso_total_das_notas;
  private String peso_total_densidade_cubagem;
  private long quantidade_total_volumes;
  private double valor_total_a_ser_cobrado;
  private String valor_total_do_seguro;
  private String filler;
}