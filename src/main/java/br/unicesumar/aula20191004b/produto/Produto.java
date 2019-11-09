package br.unicesumar.aula20191004b.produto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Produto {
	@Id
	private String id;
	private String nome;
	private double preco;
	
	
	public Produto() {
		id = UUID.randomUUID().toString();
	}
	
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}

}
