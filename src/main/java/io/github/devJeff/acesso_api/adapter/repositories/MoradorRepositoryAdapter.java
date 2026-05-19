package io.github.devJeff.acesso_api.adapter.repositories;

import java.util.Collection;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.entities.MoradorEntity;
import io.github.devJeff.acesso_api.core.domain.Morador;
import io.github.devJeff.acesso_api.core.ports.MoradorRepositoryPort;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;

    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);

    }

    @Override
    public Morador obtainByCpf(String cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtainByCpf'");
    }

    @Override
    public Collection<Morador> findAll() {
        return moradorRepository.findAll().stream()
                .map(moradorEntity -> modelMapper.map(moradorEntity, Morador.class)).toList();}

}
