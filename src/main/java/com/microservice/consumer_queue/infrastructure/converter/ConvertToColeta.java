package com.microservice.consumer_queue.infrastructure.converter;

import com.microservice.consumer_queue.interfaces.dtoBrudam.Coleta;
import com.microservice.consumer_queue.interfaces.dtoBrudam.Volume;
import com.microservice.consumer_queue.interfaces.dtoConsumer.Notfis;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@AllArgsConstructor
public class ConvertToColeta implements Converter<Notfis, Coleta> {
    private final ConvertToCarga convertToCarga;
    private final ConvertToVolume convertToVolume;

    @Override
    public Coleta convert(@NotNull Notfis source) {
        return Coleta.builder()
                .toma(1)
                .nDocEmit("81473942235")
                .dEmi(LocalDate.parse("2024-01-01"))
                .xSoli("8314u24")
                .telefoneSoli("1198989898")
                .hIni("14:00")
                .hFim("14:40")
                .rSeg(23445)
                .cSeg("seq")
                .dColeta(LocalDate.parse("2024-01-01"))
                .dColetaLim(LocalDate.parse("2024-01-01"))
                .cServ("CDP392")
                .cAut("9887DF892")
                .carga(convertToCarga.convert(source))
                .volumes(new Volume[]{convertToVolume.convert(source)})
                .cStatus(823832)
                .build();
    }
}
