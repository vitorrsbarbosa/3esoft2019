package br.unicesumar.aula20191025.disciplina;

import br.unicesumar.aula20191004b.professor.Professor;
import br.unicesumar.aula20191025.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Disciplina extends BaseEntity {
    private String nome;

    @ManyToMany
    @JoinTable(name="ministrantes",
            joinColumns = { @JoinColumn(name = "disciplina_id") },
            inverseJoinColumns = { @JoinColumn(name = "ministrantes_id") })
    private Set<Professor> ministrantes = new HashSet<>();

    public Disciplina() {
        super();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Professor> getMinistrantes() {
        return ministrantes;
    }

    public void setMinistrantes(Set<Professor> ministrantes) {
        this.ministrantes = ministrantes;
    }
    public void removerMinistrantePeloId(String idProfessor) {
        ministrantes = this.getMinistrantes().stream()
                .filter(p -> !p.getId().equals(idProfessor))
                .collect(Collectors.toSet());
		/*
		Professor paraRemover = null;
		for (Professor ministrante : this.getMinistrantes()) {
			if (ministrante.getId().equals(idProfessor)) {
				paraRemover = ministrante;
			}
		}
		this.getMinistrantes().remove(paraRemover);
		*/
    }
}
