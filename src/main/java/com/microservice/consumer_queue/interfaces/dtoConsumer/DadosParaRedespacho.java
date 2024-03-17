package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosParaRedespacho {
  private String identificador_de_registro;
  private String razao_social;
  private String cnpj;
  private String inscricao_estadual;
  private String endereco;
  private String bairro;
  private String cidade;
  private String cep;
  private String codigo_municipio;
  private String uf;
  private String area_frete;
  private String numero_de_comunicacao;
  private String filler;
}
