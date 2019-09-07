package aula20190906.br.unicesumar.pedido;

import aula20190906.br.unicesumar.produto.Produto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class ItemPedido {

    @Id
    private String id;
    private Double quantidade;
    private Double valorUnitario;
    private Double descontoPercentual;

    @ManyToOne
    private Produto produto;

    public ItemPedido(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getDescontoPercentual() {
        return descontoPercentual;
    }

}
