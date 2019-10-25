package br.unicesumar.aula20191110.table_per_class.juridica;

import br.unicesumar.aula20191110.table_per_class.pessoa.Pessoa;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Juridica extends Pessoa {

    private String razaoSocial;
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
