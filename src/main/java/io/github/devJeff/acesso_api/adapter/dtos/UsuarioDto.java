package io.github.devJeff.acesso_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrador;
}

// Alternativa:
// public record UsuarioDto(Long id, String nome, String email, String senha,
// Boolean administrador) {
// }
