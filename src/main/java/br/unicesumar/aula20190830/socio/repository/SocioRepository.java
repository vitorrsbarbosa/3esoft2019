package br.unicesumar.aula20190830.socio.repository;

import br.unicesumar.aula20190830.socio.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository<Socio,String> {
    
}