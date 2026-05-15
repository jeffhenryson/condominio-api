package io.github.devJeff.acesso_api.core.ports;

import io.github.devJeff.acesso_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {
    public Usuario create(Usuario usuario);
    public Usuario obtainByEmail(String email);
} 
