package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MercadoriaDaNotaFiscal {
  private String identificador_de_registro;
  private String quantidade_de_volumes;
  private String especie_de_acondicionamento;
  private String mercadoria_da_nota_fiscal;
  private Object filler;

}
