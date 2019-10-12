package br.unicesumar.aula20191110.table_per_class.repository;

import br.unicesumar.aula20191110.table_per_class.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,String> {
}
