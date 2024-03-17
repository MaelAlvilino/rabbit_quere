package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDoResponsavel {
  private String identificador_de_registro;
  private Object razao_social;
  private String cnpj;
  private Object inscricao_estadual;
  private String endereco;
  private Object bairro;
  private String cidade;
  private String cep;
  private String codigo_municipio;
  private String uf;
  private Object numero_de_comunicacao;
  private Object filler;
}
