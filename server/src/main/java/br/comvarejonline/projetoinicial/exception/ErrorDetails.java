package br.comvarejonline.projetoinicial.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@NoArgsConstructor
public class ErrorDetails {

    private String message;

    private String error;

    private int status;

    private Date timestamp;

    private String path;

    public ErrorDetails(String message, HttpStatus statusCode, String path) {
        this.message = message;
        this.error = statusCode.getReasonPhrase();
        this.status = statusCode.value();
        this.timestamp = new Date();
        this.path = path;
    }
}
