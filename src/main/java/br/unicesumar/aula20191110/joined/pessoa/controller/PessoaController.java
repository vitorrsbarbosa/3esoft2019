package br.unicesumar.aula20191110.joined.pessoa.controller;

import br.unicesumar.aula20191110.joined.pessoa.Fisica;
import br.unicesumar.aula20191110.joined.pessoa.Juridica;
import br.unicesumar.aula20191110.joined.pessoa.Pessoa;
import br.unicesumar.aula20191110.joined.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository repo;

    @GetMapping("/{id}")
    public List<Pessoa> getPessoa(){
        return repo.findAll();
    }

    @PostMapping("/fisicas")
    public String postPessoaFisica(@RequestBody Fisica nova) {
        return postPessoa(nova);
    }
    @PostMapping("/juridicas")
    public String postPessoaJuridica(@RequestBody Juridica nova) {
        return postPessoa(nova);
    }

    private String postPessoa(Pessoa nova){
        repo.save(nova);
        return nova.getId();
    }
}
