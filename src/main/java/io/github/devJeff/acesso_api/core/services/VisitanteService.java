package io.github.devJeff.acesso_api.core.services;

import io.github.devJeff.acesso_api.core.domain.Visitante;
import io.github.devJeff.acesso_api.core.ports.VisitanteRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.VisitanteServicePort;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) {

        Visitante visitanteExistente = visitanteRepositoryPort.obtainByRg(visitante.getRg());
        if (visitanteExistente != null) {
            throw new IllegalArgumentException("Usuário já existe!");
        }
        return visitanteRepositoryPort.create(visitante);

    }

}
