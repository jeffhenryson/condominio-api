package io.github.devJeff.acesso_api.core.ports;

import io.github.devJeff.acesso_api.core.domain.Morador;
import java.util.Collection;

public interface MoradorRepositoryPort {
    public Morador create(Morador morador);
    public Morador obtainByCpf(String cpf);
    Collection<Morador> findAll();
}
