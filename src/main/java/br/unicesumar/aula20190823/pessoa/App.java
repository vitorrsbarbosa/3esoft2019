package br.unicesumar.aula20190823.pessoa;

import br.unicesumar.aula20190521.v1.pessoa.Fisica;
import br.unicesumar.aula20190521.v1.pessoa.Juridica;

public class App {

	public static void main(String[] args) {
		Fisica wilson = new Fisica("Wilson da Silva Matos", "4.444.444-44", "444.555.445-44");
		Fisica claudio = new Fisica("Cl�udio Ferdinandi", "2.222.222-55", "123.984.445-12");
		Fisica arthur = new Fisica("Arthur Cattaneo Zavadski9", "3.333.333-74", "888.333.445-24");
		Juridica uniCesumar = new Juridica("UniCesumar Centro Universit�rio Cesumar Ltda.", "01.004.137/0001-55", 500_000d);

		uniCesumar.adicionarSocio(wilson, 70.00d);
		uniCesumar.adicionarSocio(claudio, 29.50d);
		uniCesumar.adicionarSocio(arthur, 2.25d);


		uniCesumar.removerSocio(arthur);
		System.out.println("Foi.");

	}

}