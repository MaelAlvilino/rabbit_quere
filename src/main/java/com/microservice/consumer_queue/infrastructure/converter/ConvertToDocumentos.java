package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Documento;
import com.microservice.consumer_queue.interfaces.dtoBrudam.Documentos;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertToDocumentos implements Converter<Notfis, Documentos> {
    private final ConvertToColeta convertToColeta;
    private final ConvertToCompl convertToCompl;
    private final ConvertToToma convertToToma;
    private final ConvertToRem convertToRem;
    private final ConvertToExped convertToExped;
    private final ConvertToReceb convertToReceb;
    private final ConvertToDest convertToDest;
    private final ConvertToDocumento convertToDocumento;
    @Override
    public Documentos convert(@NotNull Notfis source) {
        return Documentos.builder()
                .coleta(convertToColeta.convert(source))
                .compl(convertToCompl.convert(source))
                .toma(convertToToma.convert(source))
                .rem(convertToRem.convert(source))
                .exped(convertToExped.convert(source))
                .receb(convertToReceb.convert(source))
                .dest(convertToDest.convert(source))
                .documentos(new Documento[]{convertToDocumento.convert(source)})
                .build();
    }
}
