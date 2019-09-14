package aula20190830.br.unicesumar.socio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import aula20190830.br.unicesumar.socio.Socio;

public interface SocioRepository extends JpaRepository<Socio,String> {
    
}