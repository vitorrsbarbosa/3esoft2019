package br.unicesumar.aula20191004a.pedido;

public class Pedido {
    private int idPedido;
    private int quantidade;
    private Double valorUnitario;
    private Double descontoPercentual;
    private String produto;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    // (produto, quantidade, valorUnitario, descontoPercentual)
    public void adicionarItem(String produto, int quantidade, double valorUnitario, double descontoPercentual) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.descontoPercentual = descontoPercentual;
    }

    public int contarItens(int[] total) {
        quantidade = 0;
        for (int t : total){
            quantidade = t;
        }
        
        return quantidade;
    }

	public double getValorTotal() {
        
        Double valorTotal = 0.0;
        valorTotal = quantidade*valorUnitario;
        
		return valorTotal;
    }

    public Double getValorUnitario() {
        
        valorUnitario += valorUnitario*descontoPercentual;

        return valorUnitario;
    }

	public Pedido getItem(String item) {
		return null;
	}
    
    public int getIdPedido() {
        return idPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getDescontoPercentual() {
        return descontoPercentual;
    }

    public String getProduto() {
        return produto;
    }
}