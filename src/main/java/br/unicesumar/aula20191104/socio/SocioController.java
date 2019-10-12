package br.unicesumar.aula20191104.socio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socios")
public class SocioController {
	@Autowired
	private SocioRepository repo;
	
	@GetMapping
	public List<Socio> get() {
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Socio get(@PathVariable String id) {
		return repo.findById(id).get();
	}
	@PostMapping
	public String post(@RequestBody Socio novo) {
		repo.save(novo);
		return novo.getId();
	}
	@PutMapping("/{id}")
	public void get(@PathVariable String id, @RequestBody Socio socio) {
		if (!id.equals(socio.getId())) {
			throw new RuntimeException("Ids devem ser iguais!");
		}
		repo.save(socio);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
	
}











