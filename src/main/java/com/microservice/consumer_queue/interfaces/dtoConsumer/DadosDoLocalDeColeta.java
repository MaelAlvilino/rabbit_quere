package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDoLocalDeColeta {
  private String identificador_de_registro;
  private String cnpj_do_local_de_coleta;
  private String razao_social;
  private String inscricao_estadual;
  private String endereco_do_solicitante;
  private String complemento_do_endereco;
  private String bairro;
  private String cidade;
  private String uf;
  private String pais;
  private String cep_or_zipcode;
  private String telefone_fixo;
  private String fax;
  private String telefone_movel;
  private String endereco_de_email;
}