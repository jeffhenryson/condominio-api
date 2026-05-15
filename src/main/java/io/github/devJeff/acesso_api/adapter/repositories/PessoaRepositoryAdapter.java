package io.github.devJeff.acesso_api.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.entities.PessoaEntity;
import io.github.devJeff.acesso_api.core.domain.Pessoa;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryAdapter {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaEntity createPessoa(Pessoa pessoa){
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntity);
    }
}
