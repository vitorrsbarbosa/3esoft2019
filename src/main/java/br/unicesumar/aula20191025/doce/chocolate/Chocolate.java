package br.unicesumar.aula20191025.doce.chocolate;

import br.unicesumar.aula20191025.base.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Chocolate extends BaseEntity {
    private String sabor;

    public String getSabor() {
        return sabor;
    }
}
