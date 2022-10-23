package br.comvarejonline.projetoinicial.model;

public class FeedBack {
    String message;
    Integer status;

    public FeedBack() {}

    public FeedBack(String message, Integer status) {
        this.message = message;
        this.status = status;
    }
}
