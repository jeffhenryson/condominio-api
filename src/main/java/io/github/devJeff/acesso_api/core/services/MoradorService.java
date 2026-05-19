package io.github.devJeff.acesso_api.core.services;

import java.util.Collection;

import io.github.devJeff.acesso_api.core.domain.Morador;
import io.github.devJeff.acesso_api.core.ports.MoradorRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.MoradorServicePort;

public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
        Morador moradorExistente = moradorRepositoryPort.obtainByCpf(morador.getCpf());
        if (moradorExistente != null) {
            throw new IllegalArgumentException("Morador já existe!");
        }
        return moradorRepositoryPort.create(moradorExistente);
    }

    @Override
    public Collection<Morador> findAll() {
        return moradorRepositoryPort.findAll();
    }

}
