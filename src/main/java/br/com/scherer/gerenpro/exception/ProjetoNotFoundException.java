package br.com.scherer.gerenpro.exception;

public class ProjetoNotFoundException extends RequisicaoException {

    public ProjetoNotFoundException(String projetoId) {
        super("ProjetoNotFound", "Projeto não encontrado " + projetoId);
    }
}
