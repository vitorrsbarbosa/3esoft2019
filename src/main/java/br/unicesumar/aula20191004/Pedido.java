package br.unicesumar.aula20191004;

import java.util.List;

public class Pedido {
    private int idPedido;
    private List<Produto> produto;
    private Double quantidade;
    private Double valorUnitario;
    private Double descontoPercentual;

    public Pedido(int idPedido) {

    }

    public void adicionarItem(String string, double d, double e, double f) {
            
    }


	public double getValorTotal() {
		return 0;
	}

	public Double contarItens(int total) {
        total = 0;
        for(int cont : total){
            quantidade = total;
        }
		return quantidade;
	}

	public Pedido getItem(String string) {
		return null;
	}

    // (produto, quantidade, valorUnitario, descontoPercentual)

    
    public Double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(Double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}