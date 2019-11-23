package br.unicesumar.aula20190823.pessoa.repository;

import br.unicesumar.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.unicesumar.aula20190823.pessoa.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String>, BaseRepository<Pessoa> {

}
