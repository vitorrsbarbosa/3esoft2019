package br.unicesumar.aula20190823.pessoa.percentualDeParticipacao;

public class PercentualDeParticipacao {
	private final Double valor;
	
	public PercentualDeParticipacao(Double valor) {
		if (valor <= 0.00 || valor > 100) {
			throw new PercentualDeParticipacaoInvalido();
		}
		this.valor = valor;
	}	
	public double getValor() {
		return valor;
	}
}
