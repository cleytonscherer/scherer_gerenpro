package br.com.scherer.gerenpro.dto;

import java.time.LocalDate;

public record ProjetoCadastro(
        String      nome,
        String      descricao,
        LocalDate   dataInicio,
        LocalDate   dataFim
) {
}
