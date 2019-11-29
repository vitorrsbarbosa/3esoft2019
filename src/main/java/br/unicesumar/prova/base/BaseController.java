package br.unicesumar.prova.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

public abstract class BaseController<ENTITY extends BaseEntity, REPOSITORY extends BaseRepository<ENTITY>> {
    @Autowired
    private REPOSITORY repo;

    public REPOSITORY getRepo() {
        return repo;
    }
    @GetMapping
    public List<ENTITY> getAll() {
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public ENTITY getById(@PathVariable("id") String id) {
        return repo.findById(id).get();
    }
    @PostMapping
    public String post(@RequestBody ENTITY obj) {
        beforePost(obj);
        repo.save(obj);
        afterPost(obj);
        return obj.getId();
    }
    private void beforePost(ENTITY obj) {}
    private void afterPost(ENTITY obj)  {}

    private ResponseEntity goodHttpResponse (Integer status) {
        return ResponseEntity.status(status).build();
    }
    private ResponseEntity badHttpResponse (Integer status, String message) {
        return ResponseEntity.status(status).body(message);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> put(@PathVariable String id, @RequestBody ENTITY obj) {
        if(!Objects.equals(id, obj.getId()))
            return badHttpResponse(400,"Requisição inválida");
        if(repo.findById(id).isEmpty())
            return badHttpResponse(204,"Não foi encontrado nada no repositório");
        repo.save(obj);
//        return ResponseEntity.ok().build();
        return goodHttpResponse(200);
    }
}
