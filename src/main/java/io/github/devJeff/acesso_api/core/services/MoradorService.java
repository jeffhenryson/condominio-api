package io.github.devJeff.acesso_api.core.services;

import org.modelmapper.ModelMapper;

import io.github.devJeff.acesso_api.core.domain.Morador;
import io.github.devJeff.acesso_api.core.ports.MoradorRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.MoradorServicePort;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    private final ModelMapper modelMapper;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public Morador createMorador(Morador morador) {

        Morador moradorExistente = moradorRepositoryPort.obtainByCpf(morador.getCpf());
        if (moradorExistente != null) {
            throw new IllegalArgumentException("Morador já existe!");
        }
        return modelMapper.map(moradorExistente, Morador.class);
    }

}
