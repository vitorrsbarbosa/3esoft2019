package aula20190906.br.unicesumar.pedido.Controller;

import aula20190906.br.unicesumar.pedido.Pedido;
import aula20190906.br.unicesumar.pedido.Repository.PedidoRepository;
import aula20190906.br.unicesumar.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoRepository repo;

    // curl -X GET http://localhost:9090/api/produtos
    @GetMapping
    public List<Pedido> getAll() {
        return repo.findAll();
    }
    //curl -v -H "Content-Type: application/json" -X POST http://localhost:9090/api/produtos -d "{\"nome\": \"teste\"}"
    @PostMapping
    public String post(@RequestBody Pedido novo){
        repo.save(novo);
        return novo.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        repo.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public Pedido getById(@PathVariable("id") String id){
        return repo.findById(id).get();
    }

    @PutMapping("/{id")
    public void put(@PathVariable("id") String id, @RequestBody Pedido Pedido){
        if(!id.equals(Pedido.getId())){
            throw new RuntimeException("id errado");
        }
        repo.save(Pedido);
    }
}
