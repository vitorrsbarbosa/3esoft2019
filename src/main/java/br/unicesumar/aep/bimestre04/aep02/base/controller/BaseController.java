package br.unicesumar.aep.bimestre04.aep02.base.controller;

import br.unicesumar.aep.bimestre04.aep02.base.entity.BaseEntity;
import br.unicesumar.aep.bimestre04.aep02.base.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@RestController
public abstract class BaseController<ENTITY extends BaseEntity, REPOSITORY extends BaseRepository<ENTITY>> {
    @Autowired
    private REPOSITORY repo;

    public REPOSITORY getRepo() {
        return repo;
    }

    public List<ENTITY> getAll() {
        if(repo.findAll().contains(null)){
            /** HTTP 204 -> No Content
             * Não há conteúdo para enviar para esta solicitação,
             * mas os cabeçalhos podem ser úteis.
             * O user-agent pode atualizar seus cabeçalhos em cache para este recurso com os novos.
             */
            ResponseEntity.status(204).body("Não há nada gravado na lista");
            return null;
        }
        /** HTTP 200 -> Continue
         * Requisição bem sucedidade.
         * O recurso foi buscado e transmitido no corpo da mensagem.
         */

        ResponseEntity.status(200).build();
        return repo.findAll();
    }

    @GetMapping("/{id")
    public ENTITY getById(@PathVariable("id") String id, @RequestBody ENTITY objEntity) {
        if(!Objects.equals(id,objEntity.getId())) {
            /** HTTP 404 -> Not Found
             * O servidor não pode encontrar o recurso solicitado.
             * Este código de resposta talvez seja o mais famoso devido à frequência com que acontece na web.
             *
             */
            ResponseEntity.status(404).body("Não foi possível encontrar nada com este Id");
        }

        ResponseEntity.status(200).build();
        return repo.findById(id).get();
    }

    @PostMapping
    public String post(@PathVariable String id, @RequestBody ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            /** HTTP 400 -> Bad request
             * Essa resposta significa que o servidor não entendeu a requisição pois está com uma sintaxe inválida.
             */
            ResponseEntity.status(400).body("Requisição inválida, verifique novamente o ID");
        }

        beforePost(objEntity);
        repo.save(objEntity);
        afterPost(objEntity);
        return objEntity.getId();
    }

    public abstract void beforePost(ENTITY objEntity);

    public abstract void afterPost(ENTITY objEntity);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id, ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            ResponseEntity.status(400).body("Requisição inválida, verifique novamente o ID");
        }
        ResponseEntity.status(200).build();
        repo.deleteById(id);
    }

    @PutMapping("/{id")
    public ResponseEntity<String> put(@PathVariable String id, @RequestBody ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            ResponseEntity.status(400).body("Requisição inválida, verifique novamente o ID");
        }
        if(!repo.findById(id).isPresent()) {
            return ResponseEntity.status(404).build();
        }
        repo.save(objEntity);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
