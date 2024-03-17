package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Compl;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertToCompl implements Converter<Notfis, Compl> {
    private final ConvertToRespEntrega convertToRespEntrega;
    private final ConvertToRespColeta convertToRespColeta;
    @Override
    public Compl convert(@NotNull Notfis source) {
        return Compl.builder()
                .respEntrega(convertToRespEntrega.convert(source))
                .respColeta(convertToRespColeta.convert(source))
                .build();
    }
}
