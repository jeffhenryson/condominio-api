package io.github.devJeff.acesso_api.core.ports;

import io.github.devJeff.acesso_api.core.domain.Visitante;

public interface VisitanteServicePort {
    Visitante createVisitante(Visitante visitante);
}
