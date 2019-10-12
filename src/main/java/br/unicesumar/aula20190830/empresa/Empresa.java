package br.unicesumar.aula20190830.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Empresa {
    @Id
    public String id;
    public String razaoSocial;
    private ContratoSocial contratoSocial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empresa")
    private List<ContratoSocial> contratos = new ArrayList<>();

    public Empresa(String termosDoContrato) {
        this.id = UUID.randomUUID().toString();
        this.contratoSocial = new ContratoSocial(termosDoContrato);
    }

    public ContratoSocial getContratoSocial() {
        return contratoSocial;
    }

    public String getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Entity
    public static class ContratoSocial {

        @Id
        private String id;
        private String termos;

        public ContratoSocial(String termosDoContrato) {
            this.id = UUID.randomUUID().toString();
        }

        public String getId() {
            return id;
        }

        public String getTermos() {
            return termos;
        }
    }
}