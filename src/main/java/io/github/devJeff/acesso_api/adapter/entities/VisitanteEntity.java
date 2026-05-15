package io.github.devJeff.acesso_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="tb_visitante")
@AllArgsConstructor
@NoArgsConstructor
public class VisitanteEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String rg;
    @OneToOne
    @JoinColumn(name="pessoa_id")
    private PessoaEntity pessoaEntity;
}
