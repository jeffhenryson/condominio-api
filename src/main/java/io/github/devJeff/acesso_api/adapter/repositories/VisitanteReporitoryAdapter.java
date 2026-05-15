package io.github.devJeff.acesso_api.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.entities.VisitanteEntity;
import io.github.devJeff.acesso_api.core.domain.Visitante;
import io.github.devJeff.acesso_api.core.ports.VisitanteRepositoryPort;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VisitanteReporitoryAdapter implements VisitanteRepositoryPort{

    private final VisitanteRepository visitanteRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Visitante create(Visitante visitante) {
        VisitanteEntity entity = modelMapper.map(visitante, VisitanteEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(visitante.getPessoa()));
        return modelMapper.map(visitanteRepository.save(entity), Visitante.class);
    }

    @Override
    public Visitante obtainByRg(String rg) {
        VisitanteEntity visitanteByRg = visitanteRepository.findByRg(rg);
        if (visitanteByRg == null) {
            return null;
        }
        return modelMapper.map(visitanteByRg, Visitante.class);
    }
    
}
