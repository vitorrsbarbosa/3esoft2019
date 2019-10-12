package br.unicesumar.aep.bimestre03.ape02.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,String> {
    
}