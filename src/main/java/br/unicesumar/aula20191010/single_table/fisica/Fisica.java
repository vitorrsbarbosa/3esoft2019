package br.unicesumar.aula20191110.single_table.fisica;

import br.unicesumar.aula20191110.single_table.pessoa.Pessoa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Fisica extends Pessoa {
    @Column
    private Date nascidaEm;

    public Date getNascidaEm() {
        return nascidaEm;
    }

}
