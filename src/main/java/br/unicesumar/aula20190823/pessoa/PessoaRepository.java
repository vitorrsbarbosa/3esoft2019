package br.unicesumar.aula20190823.pessoa;

import br.unicesumar.aula20190528.v2.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, String>{

}
