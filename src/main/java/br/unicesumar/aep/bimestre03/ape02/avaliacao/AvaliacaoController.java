package br.unicesumar.aep.bimestre03.ape02.avaliacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoRepository repo;

    @GetMapping
    public List<Avaliacao> get() {
        return repo.findAll();
    }
    @GetMapping("{id}")
    public Avaliacao get(@PathVariable String id) {
        return repo.findById(id).get();
    }
    @PostMapping
    public String post(@RequestBody Avaliacao avaliacao) {
        repo.save(avaliacao);
        return avaliacao.getId();
    }
    @PutMapping("{id}")
    public void get(@PathVariable String id, @RequestBody Avaliacao avaliacao) {
        if(!id.equals(avaliacao.getId())) {
            throw new RuntimeException("Os id devem ser iguais");
        }
        repo.save(avaliacao);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}