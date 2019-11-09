package br.unicesumar.aula20191025.professor;

import br.unicesumar.aula20191025.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Endereco extends BaseEntity {
	@Id
	private String id;
	private String logradouro;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	
}
