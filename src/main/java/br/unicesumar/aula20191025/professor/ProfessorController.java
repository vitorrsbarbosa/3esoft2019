package br.unicesumar.aula20191025.professor;

import br.unicesumar.aula20191025.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professores")
public class ProfessorController extends BaseController<Professor,ProfessorRepository> {

	@DeleteMapping("/{id}/enderecos/{idEndereco}")
	public void deleteEndereco(@PathVariable("id") String id, @PathVariable("idEndereco") String idEndereco) {
		Professor p = getRepo().findById(id).get();
		p.removerEnderecoPeloId(idEndereco);
		getRepo().save(p);
	}
}











