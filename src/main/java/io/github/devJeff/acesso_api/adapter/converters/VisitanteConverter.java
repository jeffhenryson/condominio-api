package io.github.devJeff.acesso_api.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.dtos.VisitanteDto;
import io.github.devJeff.acesso_api.core.domain.Pessoa;
import io.github.devJeff.acesso_api.core.domain.Visitante;

@Component
public class VisitanteConverter {
    public Visitante toDomain(VisitanteDto visitanteDto) {
        return new Visitante(visitanteDto.getId(), visitanteDto.getRg(), 
                new Pessoa(null, visitanteDto.getNome()));
    }

    public VisitanteDto toDto(Visitante visitante) {
        return new VisitanteDto(visitante.getId(),visitante.getPessoa().getNome(),visitante.getRg());
    }
}
