package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Carga;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToCarga implements Converter<Notfis, Carga> {
    @Override
    public Carga convert(Notfis source) {
        return Carga.builder()
                .pBru(1)
                .pCub(3)
                .qVol(source.getDados_de_nota_fiscal().getPeso_total())
                .vTot(10)
                .build();
    }
}
