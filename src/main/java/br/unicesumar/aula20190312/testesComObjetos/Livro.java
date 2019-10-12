package br.unicesumar.aula20190312.testesComObjetos;

public class Livro extends Object {
	private String titulo;
	private int quantidadeDePaginas;
	
	public Livro() {
	}
	
	public Livro(String titulo, int quantidadeDePaginas) {
		this.titulo = titulo;
		this.quantidadeDePaginas = quantidadeDePaginas;
	}
	

	@Override
	public boolean equals(Object obj) {
		boolean ehNulo = obj == null;
		if (ehNulo) {
			return false;
		}
		boolean mesmoTipo = obj instanceof Livro;
		if (!mesmoTipo) {
			return false;
		}
		//Coer��o / type casting
		//Fazemos isso para obtermos acesso aos m�todos e atributos da classe em quest�o.
		Livro aux = (Livro)obj;
		boolean mesmoTitulo = aux.titulo == this.titulo;
		boolean mesmaQuantidadeDePaginas = aux.quantidadeDePaginas == this.quantidadeDePaginas;
		return mesmoTitulo && mesmaQuantidadeDePaginas;
	}

}    
