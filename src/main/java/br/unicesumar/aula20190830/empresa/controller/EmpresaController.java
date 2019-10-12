package br.unicesumar.aula20190830.empresa.controller;

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

import br.unicesumar.aula20190830.empresa.Empresa;
import br.unicesumar.aula20190830.empresa.repository.EmpresaRepository;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaRepository repo;
		
	@GetMapping
	public List<Empresa> get() {
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Empresa get(@PathVariable String id) {
		return repo.findById(id).get();
	}
	@PostMapping
	public String post(@RequestBody Empresa nova) {
		repo.save(nova);
		return nova.id;
	}
	@PutMapping("/{id}")
	public void get(@PathVariable String id, @RequestBody Empresa empresa) {
		if (!id.equals(empresa.getId())) {
			throw new RuntimeException("Ids devem ser iguais!");
		}
		repo.save(empresa);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
	
}