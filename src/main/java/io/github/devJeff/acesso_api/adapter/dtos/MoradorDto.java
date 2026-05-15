package io.github.devJeff.acesso_api.adapter.dtos;

import io.github.devJeff.acesso_api.core.domain.Pessoa;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoradorDto {
    private Long id;
    private String cpf;
    private String endereco;
    private String celular;
    private String nome;
}
