package aula20190830.br.unicesumar.empresa.repository;

import aula20190830.br.unicesumar.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}