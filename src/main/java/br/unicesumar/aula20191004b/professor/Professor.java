package br.unicesumar.aula20191004b.professor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
public class Professor {
	@Id
	private String id;
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="professor_id",nullable=false)
	private Set<Endereco> enderecos = new HashSet<>();
	
	public Professor() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void removerEnderecoPeloId(String idEndereco) {
		enderecos = enderecos.stream().filter(e -> !e.getId().equals(idEndereco)).collect(Collectors.toSet());
	}
	
}
