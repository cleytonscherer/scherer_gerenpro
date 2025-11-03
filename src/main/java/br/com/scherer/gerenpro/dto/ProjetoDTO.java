package br.com.scherer.gerenpro.dto;

import br.com.scherer.gerenpro.entity.Projeto;
import br.com.scherer.gerenpro.entity.SituacaoProjeto;

import java.time.LocalDate;

public record ProjetoDTO(
        String      id,
        String      nome,
        String      descricao,
        LocalDate   dataInicio,
        LocalDate   dataFim,
        SituacaoProjeto situacao
) {

    public ProjetoDTO(Projeto projeto) {
        this(   projeto.getId(),
                projeto.getNome(),
                projeto.getDescricao(),
                projeto.getDataInicio(),
                projeto.getDataFim(),
                projeto.getSituacao()
        );
    }
}
