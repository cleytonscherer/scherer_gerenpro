package br.com.scherer.gerenpro.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ProjetoCadastro(
        @NotBlank(message = "Nome deve ser informado")
        @Size(min=1, max=100, message = "Nome deve ter no máximo 50 caracteres")
        String      nome,
        @NotBlank(message = "Descrição deve ser informada")
        @Size(min = 10, max = 255, message = "Descrição deve ter entre 10 e 255 caracteres")
        String      descricao,
        @NotNull(message = "Data de inicio deve ser informada")
        LocalDate   dataInicio,
        @NotNull(message = "Data de fim deve ser informada")
        LocalDate   dataFim
) {

    @AssertTrue(message = "Datas final e inicial inconsistentes")
    @SuppressWarnings("unused")
    private boolean isDataInicioBeforeDataFim() {
        return dataInicio.isBefore(dataFim);
    }
}
