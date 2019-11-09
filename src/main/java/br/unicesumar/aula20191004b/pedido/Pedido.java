package br.unicesumar.aula20191104.pedido;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Pedido {
	@Id
	private String id;
	private Long numero;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pedido_id")
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public Long getNumero() {
		return numero;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
}

