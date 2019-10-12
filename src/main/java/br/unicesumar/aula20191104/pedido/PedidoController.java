package br.unicesumar.aula20191104.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
	


}
