package AEP.br.unicesumar.ape02.conceito;

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
@RequestMapping("api/conceito")
public class ConceitoController {

    @Autowired
    private ConceitoRepository repo;

    @GetMapping
    public List<Conceito> get() {
        return repo.findAll();
    }
    @GetMapping("{id}")
    public Conceito get(@PathVariable String id) {
        return repo.findById(id).get();
    }
    @PostMapping
    public String post(@RequestBody Conceito conceito) {
        repo.save(conceito);
        return conceito.getId();
    }
    @PutMapping("{id}")
    public void get(@PathVariable String id, @RequestBody Conceito conceito) {
        if(!id.equals(conceito.getId())) {
            throw new RuntimeException("Os id devem ser iguais");
        }
        repo.save(conceito);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}