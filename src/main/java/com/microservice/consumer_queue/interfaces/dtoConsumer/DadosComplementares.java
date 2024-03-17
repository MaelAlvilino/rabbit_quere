package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosComplementares {
  private String identificador_de_registro;
  private String email;
  private String celular;
  private String tipo_do_estabelecimento;
  private String contribuinte;
  private String pais;
  private String inscricao_suframa;
  private String validade_insc_suframa;
  private Object filler;
}
