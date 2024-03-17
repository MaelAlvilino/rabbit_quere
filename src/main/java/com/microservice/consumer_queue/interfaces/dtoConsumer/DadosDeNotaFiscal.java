package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosDeNotaFiscal {
  private String identificador_de_registro;
  private String numero_romaneio;
  private String codigo_da_rota;
  private long meio_de_transporte;
  private long tipo_do_transporte;
  private long tipo_de_carga;
  private String condicao_de_frete;
  private String serie;
  private String numero;
  private String data_de_emissao;
  private String natureza_da_mercadoria;
  private String especie_acondicionamento;
  private long volume;
  private long valor_da_mercadoria;
  private long peso_total;
  private String peso_densidade_cubagem;
  private String incidencia_de_icms;
  private String seguro_efetuado;
  private String valor_do_seguro;
  private double valor_a_ser_cobrado;
  private String placa_caminhao_carreta;
  private String plano_de_carga_rapida;
  private String valor_do_frete;
  private String valor_ad_valorem;
  private String valor_total_das_taxas;
  private double valor_total_do_frete;
  private String acao_do_documento;
  private double valor_do_icms;
  private String valor_icms_retido_ou_substituido;
  private String indicacao_de_bonificacao;
  private String filler;

}