package com.microservice.consumer_queue.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimentos")

public class Movimentos implements Serializable {

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "data_alteracao")
  private LocalDateTime data_alteracao;

  @Column(name = "data_criacao")
  private LocalDateTime data_criacao;

  @Column(name = "ref_sistema")
  private Integer ref_sistema;

  @Column(name = "origem")
  private String origem;

  @Column(name = "destino")
  private String destino;

  @Column(name = "documento_origem")
  private String documento_origem;

  @Column(name = "documento_destino")
  private String documento_destino;

  @Column(name = "status_id")
  private String status_id;

  @Column(name = "arquivo_id")
  private String arquivo_id;
}
