package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CabecalhoDeDocumento {
  private String identificador_de_registro;
  private String identificacao_do_documento;
  private String filler;
}
