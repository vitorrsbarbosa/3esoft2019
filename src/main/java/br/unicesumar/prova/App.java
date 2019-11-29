package br.unicesumar.prova;

import br.unicesumar.prova.pokemon.Pokemon;
import br.unicesumar.prova.pokemon.agua.Agua;
import br.unicesumar.prova.pokemon.agua.PokemonDeAgua;
import br.unicesumar.prova.pokemon.elementos.Elemento;
import br.unicesumar.prova.pokemon.fogo.Fogo;
import br.unicesumar.prova.pokemon.fogo.PokemonDeFogo;
import org.springframework.boot.SpringApplication;

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        PokemonDeFogo<Fogo> pokemonFogo = new PokemonDeFogo<Fogo>("Charmander");
//        PokemonDeFogo<Fogo> pokemonFogo = new PokemonDeFogo<Fogo>("Charmander");
        PokemonDeAgua<Agua> pokemonAgua = new PokemonDeAgua<Agua>("Squirtle");
//        PokemonDeAgua<Fogo> pokemonAgua = new PokemonDeAgua<Fogo>("");
    }
}
