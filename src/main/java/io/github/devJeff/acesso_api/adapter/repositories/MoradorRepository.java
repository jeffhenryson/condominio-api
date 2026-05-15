package io.github.devJeff.acesso_api.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.devJeff.acesso_api.adapter.entities.MoradorEntity;

public interface MoradorRepository extends JpaRepository<MoradorEntity, Long>{
    MoradorEntity finByCpf(String cpf);
}