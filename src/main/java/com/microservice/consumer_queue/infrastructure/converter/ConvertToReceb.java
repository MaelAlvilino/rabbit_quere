package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Dest;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToReceb implements Converter<Notfis, Dest> {
    @Override
    public Dest convert(@NotNull Notfis source) {
        return Dest.builder()
                .nDoc("something")
                .ie("3284732")
                .xNome("nome")
                .xFant("nome")
                .isuf("some")
                .xLgr("logra")
                .nro("1244")
                .xCpl("complem")
                .xBairro("vila vila")
                .cMun("23342")
                .cep("3904232")
                .cPais("35")
                .email("algo@algo.com")
                .build();
    }
}
