package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.RespColeta;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToRespEntrega implements Converter<Notfis, RespColeta> {
    @Override
    public RespColeta convert(@NotNull Notfis source) {
        return RespColeta.builder()
                .tpResp(0)
                .nDoc("NFK38273MM")
                .build();
    }
}
