package br.unicesumar.AEP.ape02.aluno;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

    @Id
    private String id;
    private String nome;
    private String curso;

    public Aluno() {
    this.id = UUID.randomUUID().toString();
    }

    public String getCurso() {
        return curso;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
