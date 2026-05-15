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

@Entity
@Data
@Table(name="tb_morador")
@AllArgsConstructor
@NoArgsConstructor
public class MoradorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    private String endereco;
    private String celular;
    @OneToOne
    @JoinColumn(name="pessoa_id")
    private PessoaEntity pessoaEntity;
}
