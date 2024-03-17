package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CabecalhoDeIntercambio {
  private String identificador_de_registro;
  private String identificador_do_remetente;
  private String identificador_do_destinatario;
  private String data;
  private String hora;
  private String nome_do_arquivo;
  private String filler;
}
