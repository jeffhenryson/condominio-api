package io.github.devJeff.acesso_api.core.ports;

import java.util.Collection;
import java.util.Optional;

import io.github.devJeff.acesso_api.core.domain.Visitante;

public interface VisitanteRepositoryPort {
    public Visitante create(Visitante visitante);

    public Optional<Visitante> obtainByRg(String rg);
    Collection<Visitante> listAll();
}
