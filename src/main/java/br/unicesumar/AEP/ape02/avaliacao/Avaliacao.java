package br.unicesumar.AEP.ape02.avaliacao;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Avaliacao {

    @Id
    private String id;
    
    public String getId() {
        return id;
    }

    public Avaliacao() {
        this.id = UUID.randomUUID().toString();
    }






    @Entity
    public static class Nota {

        @Id
        private String id;
        private Float nota;
        private Float maximo;
        private Float minimo;
        public Nota() {
            this.id = UUID.randomUUID().toString();
            if(this.nota < minimo || this.nota > maximo){
                throw new RuntimeException("nota inválida");
        }else
            this.nota = nota;

        }

        public String getId() {
            return id;
        }

        public Float getNota() {
            return nota;
        }

        public Float getMaximo() {
            return 10f;
        }

        public Float getMinimo() {
            return 0f;
        }
    }
}
