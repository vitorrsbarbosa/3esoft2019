package br.unicesumar.aula20191110.single_table.juridica;

import br.unicesumar.aula20191110.single_table.pessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Juridica extends Pessoa {
    @Column(unique = true)
    private String razaoSocial;
    @Column
    private Date fundadaEm;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Date getFundadaEm() {
        return fundadaEm;
    }

    public void setFundadaEm(Date fundadaEm) {
        this.fundadaEm = fundadaEm;
    }
}
