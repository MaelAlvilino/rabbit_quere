package com.microservice.consumer_queue.interfaces.dtoBrudam;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Documentos {
  private Coleta coleta;
  private Compl compl;
  private Dest toma;
  private Dest rem;
  private Dest exped;
  private Dest receb;
  private Dest dest;
  private Documento[] documentos;
}