package aula20190830.br.unicesumar.produto.Controller;
import java.util.List;
import aula20190830.br.unicesumar.produto.Produto;
import aula20190830.br.unicesumar.produto.Repository.ProdutoRepository;

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
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repo;

    // curl -X GET http://localhost:9090/api/produtos
    @GetMapping
    public List<Produto> getAll() {
        return repo.findAll();
    }
    //curl -v -H "Content-Type: application/json" -X POST http://localhost:9090/api/produtos -d "{\"nome\": \"teste\"}"
    @PostMapping
    public String post(@RequestBody Produto novo){
        repo.save(novo);
        return novo.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        repo.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public Produto getById(@PathVariable("id") String id){
        return repo.findById(id).get();
    }

    @PutMapping("/{id")
    public void put(@PathVariable("id") String id, @RequestBody Produto Produto){
        if(!id.equals(Produto.getId())){
            throw new RuntimeException("id errado");
        }
        repo.save(Produto);
    }
}
