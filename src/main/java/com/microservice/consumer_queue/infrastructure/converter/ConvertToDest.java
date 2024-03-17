package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Dest;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDest implements Converter<Notfis, Dest> {
    @Override
    public Dest convert(@NotNull Notfis source) {
        return Dest.builder()
                .nDoc(source.getDados_do_destinatario().getCnpj_ou_cpf())
                .ie(source.getDados_do_destinatario().getInscricao_estadual())
                .xNome(source.getDados_do_destinatario().getRazao_social())
                .xFant(source.getDados_do_destinatario().getRazao_social())
                .isuf("")
                .xLgr(source.getDados_do_destinatario().getLogradouro())
                .nro(source.getDados_do_destinatario().getNumero())
                .xCpl("")
                .xBairro(source.getDados_do_destinatario().getBairro())
                .cMun(source.getDados_do_destinatario().getCodigo_de_municipio())
                .cep(source.getDados_do_destinatario().getCep())
                .cPais(source.getDados_complementares_do_destinatario().getPais())
                .email(source.getDados_complementares_do_destinatario().getEmail())
                .build();
    }
}
