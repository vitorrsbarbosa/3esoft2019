package br.unicesumar.aep.bimestre04.aep02.base.controller;

import br.unicesumar.aep.bimestre04.aep02.base.entity.BaseEntity;
import br.unicesumar.aep.bimestre04.aep02.base.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if (repo.findAll().contains(null)) {
            /** HTTP 204 -> No Content
             * Não há conteúdo para enviar para esta solicitação
             */
            httpResponse(204, "Não há nada gravado na lista");
            return null;
        }
        /** HTTP 200 -> Continue
         * Requisição bem sucedidade.
         * O recurso foi buscado e transmitido no corpo da mensagem.
         */
        httpResponse(200);
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
            httpResponse(404,"Não foi possível encontrar nada para este Id");
        }
        httpResponse(200);
        return repo.findById(id).get();
    }

    @PostMapping
    public String post(@PathVariable String id, @RequestBody ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            /** HTTP 400 -> Bad request
             * Essa resposta significa que o servidor não entendeu a requisição pois está com uma sintaxe inválida.
             */
            httpResponse(400,"Requisição inválida, verifique o ID");
        }

        beforePost(objEntity);
        repo.save(objEntity);
        afterPost(objEntity);
        return objEntity.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id, ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            httpResponse(400,"Requisição inválida, verifique o ID");
        }
        httpResponse(200);
        repo.deleteById(id);
    }

    @PutMapping("/{id")
    public ResponseEntity<String> put(@PathVariable String id, @RequestBody ENTITY objEntity) {
        if(!Objects.equals(id, objEntity.getId())) {
            httpResponse(400,"Requisição inválida, verifique o ID");
        }
        if(!repo.findById(id).isPresent()) {
            httpResponse(404,"não foi possível encontrar");
        }
        repo.save(objEntity);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    protected abstract void beforePost(ENTITY objEntity);

    protected abstract void afterPost(ENTITY objEntity);

    private ResponseEntity<String> httpResponse(Integer status, String message) {
        return ResponseEntity.status(status).body(message);
    }
    private ResponseEntity<String> httpResponse(Integer status) {
        return ResponseEntity.status(status).build();
    }
}
