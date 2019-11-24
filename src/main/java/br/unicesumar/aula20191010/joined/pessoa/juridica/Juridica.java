package br.unicesumar.aula20191010.joined.pessoa.juridica;

import br.unicesumar.aula20191010.joined.pessoa.pessoa.Pessoa;

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