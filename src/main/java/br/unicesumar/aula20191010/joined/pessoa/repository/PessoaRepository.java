package br.unicesumar.aula20191110.joined.pessoa.repository;

import br.unicesumar.aula20191110.joined.pessoa.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,String> {
}
