package br.com.scherer.gerenpro.exception;

import lombok.Getter;

@Getter
public class RequisicaoException extends RuntimeException {

    private final String errorCode;

    public RequisicaoException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
