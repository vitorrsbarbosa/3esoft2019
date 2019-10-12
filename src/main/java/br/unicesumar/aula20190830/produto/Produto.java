package br.unicesumar.aula20190830.produto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Produto {
    @Id
    private String id;
    private String nome;
    private Double preco;


    public Produto() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

}
