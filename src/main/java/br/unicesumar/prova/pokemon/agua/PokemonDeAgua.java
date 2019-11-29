package br.unicesumar.prova.pokemon.agua;

import br.unicesumar.prova.pokemon.Pokemon;
import br.unicesumar.prova.pokemon.elementos.Elemento;
import br.unicesumar.prova.pokemon.fogo.PokemonDeFogo;

public class PokemonDeAgua<T extends Agua> extends Pokemon {
    private String nome;

    public PokemonDeAgua(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
