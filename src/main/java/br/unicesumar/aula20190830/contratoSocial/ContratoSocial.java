package br.unicesumar.aula20190830.contratoSocial;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContratoSocial {

    @Id
    private String id;
    private String termos;

    public ContratoSocial(String termosDoContrato) {
        this.id = UUID.randomUUID().toString();
    }

    public String getTermos() {
        return termos;
    }
}