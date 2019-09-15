package AEP.br.unicesumar.ape02.avaliacao;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Avaliacao {

    
    @Entity
    public static class Nota {

        @Id
        private String id;
        private Double valor;

        public Nota() {
            this.id = UUID.randomUUID().toString();
            
        }
        public String getId() {
            return id;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
