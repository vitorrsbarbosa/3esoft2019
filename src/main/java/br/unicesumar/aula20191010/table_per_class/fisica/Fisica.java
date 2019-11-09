package br.unicesumar.aula20191010.table_per_class.fisica;

import br.unicesumar.aula20191010.table_per_class.pessoa.Pessoa;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table()
public class Fisica extends Pessoa {

    private Date nascidaEm;

    public Date getNascidaEm() {
        return nascidaEm;
    }

}
