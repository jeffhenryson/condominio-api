package io.github.devJeff.acesso_api.core.ports;

import java.util.Collection;

import io.github.devJeff.acesso_api.core.domain.Morador;
public interface MoradorServicePort {
    Morador createMorador(Morador morador);
    Collection<Morador> findAll();
}