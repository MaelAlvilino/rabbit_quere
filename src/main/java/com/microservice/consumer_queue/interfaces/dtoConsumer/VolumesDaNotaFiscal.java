package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VolumesDaNotaFiscal {
  private String identificador_de_registro;
  private String carga_expedicao;
  private String peso;
  private String peso_aferido;
  private String peso_cubano;
  private String comprimento;
  private String largura;
  private String altura;
  private String codigo_de_barras;
  private String canal_de_venda;
  private String referencia_parceiro;
  private String filler;
}