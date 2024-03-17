package com.microservice.consumer_queue.interfaces.dtoConsumer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notfis {
  private CabecalhoDeIntercambio cabecalhoDeIntercambio;
  private CabecalhoDeDocumento cabecalho_de_documento;
  private ConhecimentoDeRedespacho conhecimento_de_redespacho;
  private DadosDoRemetente dados_do_remetente;
  private DadosComplementares dados_complementares_do_remetente;
  private DadosDoLocalDeColeta dados_do_local_de_coleta;
  private DadosDoDestinatario dados_do_destinatario;
  private DadosComplementares dados_complementares_do_destinatario;
  private DadosDeNotaFiscal dados_de_nota_fiscal;
  private DadosComplementaresNf dados_complementares_nf;
  private VolumesDaNotaFiscal volumes_da_nota_fiscal;
  private MercadoriaDaNotaFiscal mercadoria_da_nota_fiscal;
  private DadosDoConsignatario dados_do_consignatario;
  private DadosComplementares dados_complementares_do_consignatario;
  private DadosParaRedespacho dados_para_redespacho;
  private DadosComplementares dados_complementares_do_redespacho;
  private DadosDoResponsavel dados_do_responsavel;
  private DadosComplementares dados_complementares_do_responsavel;
  private ValoresTotaisDocumento valores_totais_documento;
}
