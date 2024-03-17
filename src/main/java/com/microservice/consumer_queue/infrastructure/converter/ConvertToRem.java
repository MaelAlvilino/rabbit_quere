package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Dest;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import com.microservice.consumer_queue.infrastructure.external.CepService;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertToRem implements Converter<Notfis, Dest> {
    private final CepService getIbge;
    @Override
    public Dest convert(@NotNull Notfis source) {
        return Dest.builder()
                .nDoc(source.getDados_do_remetente().getCnpj())
                .ie(source.getDados_do_remetente().getInscricao_estadual())
                .xNome(source.getDados_do_remetente().getRazao_social())
                .xFant(source.getDados_do_remetente().getRazao_social())
                .isuf("")
                .xLgr("")
                .nro("")
                .xCpl("")
                .xBairro("")
                .cMun(getIbge.handleCepInformation(source.getDados_do_remetente().getCep()))
                .cep(source.getDados_do_remetente().getCep())
                .cPais(source.getDados_complementares_do_remetente().getPais())
                .email(source.getDados_complementares_do_remetente().getEmail())
                .build();
    }
}
