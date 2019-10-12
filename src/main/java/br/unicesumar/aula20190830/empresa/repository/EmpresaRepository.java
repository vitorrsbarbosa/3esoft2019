package br.unicesumar.aula20190830.empresa.repository;

import br.unicesumar.aula20190830.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}