package io.github.devJeff.acesso_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitanteDto {

    private Long id;
    private String nome;
    private String rg;
}
