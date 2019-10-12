package br.unicesumar.AEP.ape02.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,String> {
    
}