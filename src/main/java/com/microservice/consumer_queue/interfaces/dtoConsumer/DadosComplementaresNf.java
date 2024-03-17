package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosComplementaresNf {
  private String identificador_de_registro;
  private long tipo_periodo_de_entrega;
  private Object data_inicial_de_entrega;
  private Object hora_inicial_de_entrega;
  private String data_final_de_entrega;
  private Object hora_final_de_entrega;
  private String uso_do_cliente;
  private String observacao_conhecimento;
  private String pedido_ou_instancia;
  private Object aliquota_icms;
  private String base_calculo_icms;
  private String cfop_da_nf;
  private String complemento_de_entrega;
  private String referencia_de_entrega;
}
