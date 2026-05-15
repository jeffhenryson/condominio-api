package io.github.devJeff.acesso_api.core.ports;

import io.github.devJeff.acesso_api.core.domain.Usuario;

public interface UsuarioServicePort {
    Usuario createUsuario(Usuario usuario);
}
