package io.github.devJeff.acesso_api.core.ports;

import java.util.Collection;

import io.github.devJeff.acesso_api.core.domain.Visitante;

public interface VisitanteServicePort {
    Visitante createVisitante(Visitante visitante);
    Visitante obtainByRg(String rg);
    Collection<Visitante> listAll();
}
