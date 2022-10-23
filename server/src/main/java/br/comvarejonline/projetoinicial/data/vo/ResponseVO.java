package br.comvarejonline.projetoinicial.data.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

public class ResponseVO implements Serializable {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public ResponseVO(Object data) {
        this.data = data;
    }

    public ResponseVO(String message) {
        this.message = this.getMessage(message);
    }

    public ResponseVO(String message, Object data) {
        this.message = this.getMessage(message);
        this.data = data;
    }

    public ResponseVO(Integer status, String message, Object data) {
        this.status = status;
        this.message = this.getMessage(message);
        this.data = data;
    }

    public ResponseVO(Integer status, String message) {
        this.status = status;
        this.message = this.getMessage(message);
    }

    private String getMessage(String message) {
        return message;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public ResponseVO() {}
}
