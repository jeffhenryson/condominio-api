package io.github.devJeff.acesso_api.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.dtos.MoradorDto;
import io.github.devJeff.acesso_api.core.domain.Morador;
import io.github.devJeff.acesso_api.core.domain.Pessoa;

@Component
public class MoradorConverter {

    public Morador toDomain(MoradorDto moradorDto){
        return new Morador(moradorDto.getId(), moradorDto.getCpf(), moradorDto.getEndereco(),
                moradorDto.getCelular(),
                new Pessoa(null,moradorDto.getNome()));
    }

        public MoradorDto toDto(Morador morador) {
        return new MoradorDto(morador.getId(),
            morador.getPessoa().getNome(),
            morador.getCpf(),
            morador.getEndereco(),
            morador.getCelular());
    }
}
