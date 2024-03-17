package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConhecimentoDeRedespacho {
  private String identificador_de_registro;
  private String cnpj_emissor_conhecto;
  private String sigla_filial;
  private String numero;
  private String serie;
  private String data_emissao;
  private String total_do_frete;
  private long frete_peso;
  private long frete_valor;
  private String valor_base_calculo_icms;
  private String valor_icms;
  private String peso_cubado;
  private String peso_real_aferido;
  private long peso_faturado;
  private String volumes_consolidados;
  private long meio_de_transporte;
  private String awb_ctrc;
  private String filler;
}
