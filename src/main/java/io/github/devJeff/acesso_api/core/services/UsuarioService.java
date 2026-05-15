package io.github.devJeff.acesso_api.core.services;

import io.github.devJeff.acesso_api.core.domain.Usuario;
import io.github.devJeff.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.devJeff.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort{

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort){
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }
    
    @Override
    public Usuario createUsuario(Usuario usuario){

        Usuario  usuarioExiste = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
        if (usuarioExiste != null) {
            throw new IllegalArgumentException("Usuário já existe!");
        }
        return usuarioRepositoryPort.create(usuario);
    }
}
