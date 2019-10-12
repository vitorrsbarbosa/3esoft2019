package br.unicesumar.aula20191110.table_per_class;

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
