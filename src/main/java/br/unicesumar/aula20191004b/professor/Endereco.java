package br.unicesumar.aula20191104.professor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Endereco {
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
