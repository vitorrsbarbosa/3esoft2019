package br.unicesumar.aula20190830.pedido.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.aula20190830.pedido.Pedido;
import br.unicesumar.aula20190830.pedido.Repository.PedidoRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
	@Autowired
	private PedidoRepository repo;
	
	@GetMapping
	public List<Pedido> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody Pedido novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
	
    // @GetMapping
    // public List<Produto> getAll(@RequestParam("argumento") String argumento) {
    //     return repo.findByNome();
    // }
    // @GetMapping("maiorPreco")
    // public Page<Produto> getMaiorPreco(Pageable p) {
    //     return repo.encontrarProdutoComMaiorPreco(p);
    // }
    // @GetMapping("menorPreco")
    // public Page<Produto> getMenorPreco(Pageable p) {
    //     return repo.encontrarProdutoComMenorPreco(p);
    // }
    // //curl -v -H "Content-Type: application/json" -X POST http://localhost:9090/api/produtos -d "{\"nome\": \"teste\"}"
    // @GetMapping(value = "/{id}")
    // public Pedido getById(@PathVariable("id") String id){
    //     return repo.findById(id).get();
    // }
    // @PutMapping("/{id")
    // public void put(@PathVariable("id") String id, @RequestBody Pedido Pedido){
    //     if(!id.equals(Pedido.getId())){
    //         throw new RuntimeException("id errado");
    //     }
    //     repo.save(Pedido);
    // }
}