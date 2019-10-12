package br.unicesumar.aula20191110.single_table.controller;

import br.unicesumar.aula20191110.joined.pessoa.Pessoa;
import br.unicesumar.aula20191110.single_table.repository.PessoaRepository;
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
