package br.unicesumar.aula20191104.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repo;
	
	@GetMapping
	public List<Produto> getAll(@RequestParam("argumento") String argumento) {
		if (argumento == null || argumento.trim().length() == 0) {
			return repo.findAll();
		}
		return repo.findByNome(argumento);
	}
	
	@GetMapping("/maiorPreco")
	public Page<Produto> getMaiorPreco(Pageable p) {
		return repo.encontrarProdutosComMaiorPreco(p); 
	}
	
	@GetMapping("/menorPreco")
	public Page<Produto> getMenorPreco(Pageable p) {
		return repo.encontrarProdutosComMenorPreco(p);
	}
	
	
	@PostMapping
	public String post(@RequestBody Produto novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}

	
}
