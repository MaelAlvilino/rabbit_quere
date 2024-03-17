package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Docs;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConsumerConverter implements Converter<Notfis, Docs> {

  @Autowired
  private  ConvertToDocumentos convertToDocumentos;

  @Override
  public Docs convert(@NotNull Notfis source) {
    return Docs.builder()
        .documentos(convertToDocumentos.convert(source))
        .build();
  }
}
