package AEP.br.unicesumar.ape02.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conceito {

    @Id
    private String id;
    private Boolean aprovado;
    

    public Conceito() {
        this.id = UUID.randomUUID().toString();
    }
}