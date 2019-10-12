package br.unicesumar.aula20190726b.prova;

import br.unicesumar.aula20190726b.prova.cor.Cor;
import br.unicesumar.aula20190726b.prova.produto.Produto;
import br.unicesumar.aula20190726b.prova.value_objects.Nome;

public class App {
	
	public static void main(String[] args) {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lilás = new Cor(new Nome("Lil�s"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa, lilás}, 
				lilás);
	}

}
