package br.com.scherer.gerenpro.entity;

import br.com.scherer.gerenpro.dto.ProjetoCadastro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "projetos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String      id;

    private String      nome;

    private String      descricao;

    private LocalDate   dataInicio;

    private LocalDate   dataFim;

    private LocalDate   dataCriacao;

    private LocalDate   dataAlteracao;

    private SituacaoProjeto situacao;

    private boolean     ativo;

    public Projeto(ProjetoCadastro projetoCadastro) {
        this.setNome(projetoCadastro.nome());
        this.setDescricao(projetoCadastro.descricao());
        this.setDataInicio(projetoCadastro.dataInicio());
        this.setDataFim(projetoCadastro.dataFim());
    }
}
