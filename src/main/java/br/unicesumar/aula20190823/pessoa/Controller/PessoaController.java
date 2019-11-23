package br.unicesumar.aula20190823.pessoa.Controller;


import br.unicesumar.aula20190823.pessoa.Pessoa;
import br.unicesumar.aula20190823.pessoa.fisica.Fisica;
import br.unicesumar.aula20190823.pessoa.juridica.Juridica;
import br.unicesumar.aula20190823.pessoa.repository.PessoaRepository;
import br.unicesumar.base.BaseController;
import br.unicesumar.base.Exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController extends BaseController<Pessoa, PessoaRepository> {

	@Override
	public void afterPost(Pessoa object) {
		if (object.getId().contains("b")) {
			throw new BusinessException("Letra 'b' n�o permitida no id!");
		}
	}

	@PostMapping("/fisicas")
	public String post(@RequestBody Fisica nova) {
		return super.post(nova);
	}

	@PostMapping("/juridicas")
	public String post(@RequestBody Juridica nova) {
		return super.post(nova);
	}

	@PutMapping("/fisicas/{id}")
	public ResponseEntity<String> put(@PathVariable("id") String id, @RequestBody Fisica pessoa) {
		return super.put(id, pessoa);
	}

	@PutMapping("/juridicas/{id}")
	public ResponseEntity<String> put(@PathVariable("id") String id, @RequestBody Juridica pessoa) {
		return super.put(id, pessoa);
	}
}