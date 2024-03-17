package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Volume;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToVolume implements Converter<Notfis, Volume> {
    @Override
    public Volume convert(@NotNull Notfis source) {
        return Volume.builder()
                .dCOM(1)
                .dLar(5)
                .dAlt(9)
                .qVol(20)
                .pBru(30)
                .pCub(15)
                .cEtiq("ETI349EDM")
                .build();
    }
}
