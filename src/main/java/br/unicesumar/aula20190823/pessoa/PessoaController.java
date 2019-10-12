package br.unicesumar.aula20190823.pessoa;

import java.util.List;

import br.unicesumar.aula20190528.v2.pessoa.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepository repo;
	
	
	@GetMapping
	public List<Pessoa> get() {
		return repo.findAll();
	}
	

}
