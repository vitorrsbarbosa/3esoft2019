package br.unicesumar.aula20190823.pessoa.fisica;

import br.unicesumar.aula20190823.pessoa.Pessoa;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Fisica extends Pessoa {
	private Date nascidaEm;

	public Date getNascidaEm() {
		return nascidaEm;
	}
	
	

}
