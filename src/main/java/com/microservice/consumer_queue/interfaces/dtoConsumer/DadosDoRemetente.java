package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDoRemetente {
  private String identificador_de_registro;
  private String cnpj;
  private String inscricao_estadual;
  private String endereco;
  private String cidade;
  private String cep;
  private String uf;
  private String data_embarque;
  private String razao_social;
  private Object filler;
}
