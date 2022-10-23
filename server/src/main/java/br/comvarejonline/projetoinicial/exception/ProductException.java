package br.comvarejonline.projetoinicial.exception;

public class ProductException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProductException(Exception exception) {
        super(exception);
    }
}