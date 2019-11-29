package br.unicesumar.prova.pokemon.fogo;

import br.unicesumar.prova.pokemon.Pokemon;
import br.unicesumar.prova.pokemon.elementos.Elemento;

public class PokemonDeFogo<T extends Fogo> extends Pokemon {
    private String nome;

    public PokemonDeFogo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
