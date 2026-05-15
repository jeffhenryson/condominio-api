package io.github.devJeff.acesso_api.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.devJeff.acesso_api.adapter.entities.VisitanteEntity;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    VisitanteEntity findByRg(String rg);
}
