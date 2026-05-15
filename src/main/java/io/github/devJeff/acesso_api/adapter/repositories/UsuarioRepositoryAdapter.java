package io.github.devJeff.acesso_api.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devJeff.acesso_api.adapter.entities.PessoaEntity;
import io.github.devJeff.acesso_api.adapter.entities.UsuarioEntity;
import io.github.devJeff.acesso_api.core.domain.Pessoa;
import io.github.devJeff.acesso_api.core.domain.Usuario;
import io.github.devJeff.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;

    private final ModelMapper modelMapper;

    private final PessoaRepository pessoaRepository;

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoaEntity(createPessoa(usuario.getPessoa()));
        UsuarioEntity novUsuarioEntity = usuarioRepository.save(usuarioEntity);

        return modelMapper.map(novUsuarioEntity, Usuario.class);
    }

    private PessoaEntity createPessoa(Pessoa pessoa) {
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaRepository.save(pessoaEntity);
    }

    @Override
    public Usuario obtainByEmail(String email) {
        UsuarioEntity usuarioByEmail = usuarioRepository.findbyEmail(email);
        if (usuarioByEmail == null) {
            return null;
        }
        return modelMapper.map(usuarioByEmail, Usuario.class);
    }

}
