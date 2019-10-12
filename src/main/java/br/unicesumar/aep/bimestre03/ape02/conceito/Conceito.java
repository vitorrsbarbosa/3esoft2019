package br.unicesumar.aep.bimestre03.ape02.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.unicesumar.aep.bimestre03.ape02.aluno.Aluno;
import br.unicesumar.aep.bimestre03.ape02.avaliacao.Avaliacao;
import br.unicesumar.aep.bimestre03.ape02.avaliacao.Avaliacao.Nota;

@Entity
public class Conceito {

    @Id
    private String id;
    private Boolean aprovado;
    private Avaliacao avaliacao;
    private Aluno aluno;
    private Nota nota;
    private Float media;

    public Conceito() {
        this.id = UUID.randomUUID().toString();

        if (nota.getNota() >= media) {
            this.setAprovado(true);
        }
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public String getId() {
        return id;
    }
    public Float getMedia() {
        return 6f;
    }
}