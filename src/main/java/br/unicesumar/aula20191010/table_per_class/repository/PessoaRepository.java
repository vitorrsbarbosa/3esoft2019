package br.unicesumar.aula20191010.table_per_class.repository;

import br.unicesumar.aula20191010.table_per_class.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,String> {
}
