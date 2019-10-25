package br.unicesumar.aula20191110.table_per_class.controller;

import br.unicesumar.aula20191110.table_per_class.pessoa.Pessoa;
import br.unicesumar.aula20191110.table_per_class.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository repo;

    @GetMapping("/{id}")
    public List<Pessoa> getPessoas(){
        return repo.findAll();
    }


}
