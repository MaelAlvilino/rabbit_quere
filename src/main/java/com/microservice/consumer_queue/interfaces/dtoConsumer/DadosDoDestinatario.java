package com.microservice.consumer_queue.interfaces.dtoConsumer;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDoDestinatario {
  private String identificador_de_registro;
  private String razao_social;
  private String cnpj_ou_cpf;
  private String inscricao_estadual;
  private String logradouro;
  private String numero;
  private String bairro;
  private String cidade;
  private String cep;
  private String codigo_de_municipio;
  private String uf;
  private Object area_de_frete;
  private String numero_de_comunicacao;
  private long identificacao_destinatario;
  private Object filler;
}