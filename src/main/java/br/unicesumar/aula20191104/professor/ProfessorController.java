package br.unicesumar.aula20191104.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professores")
public class ProfessorController {
	@Autowired
	private ProfessorRepository repo;
	
	@GetMapping
	public List<Professor> get() {
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Professor get(@PathVariable String id) {
		return repo.findById(id).get();
	}
	@PostMapping
	public String post(@RequestBody Professor novo) {
		repo.save(novo);
		return novo.getId();
	}
	@PutMapping("/{id}")
	public void get(@PathVariable String id, @RequestBody Professor professor) {
		if (!id.equals(professor.getId())) {
			throw new RuntimeException("Ids devem ser iguais!");
		}
		repo.save(professor);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
	@DeleteMapping("/{id}/enderecos/{idEndereco}")
	public void deleteEndereco(@PathVariable("id") String id, @PathVariable("idEndereco") String idEndereco) {
		Professor p = repo.findById(id).get();
		p.removerEnderecoPeloId(idEndereco);
		repo.save(p);
	}
	
}











