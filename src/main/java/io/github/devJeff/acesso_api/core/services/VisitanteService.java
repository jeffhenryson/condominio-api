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

        visitanteRepositoryPort.obtainByRg(visitante.getRg()).ifPresent(v -> {
            throw new IllegalArgumentException("Visitante já existe!");
        });

        return visitanteRepositoryPort.create(visitante);
    }

}
