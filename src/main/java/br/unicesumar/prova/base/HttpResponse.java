package br.unicesumar.prova.base;

import org.springframework.http.ResponseEntity;

public class HttpResponse {

    private Integer status;
    private String message;

    private ResponseEntity<String> response(Integer status) {
        return ResponseEntity.status(status).build();
    }

    private ResponseEntity<String> response(Integer status, String message) {
        return ResponseEntity.status(status).body(message);
    }

    public ResponseEntity getResponse(ResponseEntity typeResponse) {
        typeResponse = (typeResponse.equals(true)) ?
                response(this.status) : response(this.status,this.message);
        return typeResponse;
    }


}
