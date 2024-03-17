package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Documento;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDocumento implements Converter<Notfis, Documento> {
    @Override
    public Documento convert(@NotNull Notfis source) {
        return Documento.builder()
                .nPed("")
                .serie("")
                .nDoc("")
                .dEmi("")
                .vBC(1)
                .vICMS(1)
                .vBCST(2)
                .vST(3)
                .vProd(4)
                .vNF(5)
                .nCFOP(6)
                .pBru(7)
                .qVol(2)
                .pin(1)
                .chave("")
                .tpDoc("")
                .xEsp("")
                .xNat("")
                .build();
    }
}
