package br.unicesumar.aula20191025.base.controller;

import br.unicesumar.aula20191025.base.entity.BaseEntity;
import br.unicesumar.aula20191025.base.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


//@RestController
public abstract class BaseController<ENTITY extends BaseEntity, REPOSITORY extends BaseRepository<ENTITY>> {
    @Autowired
    private REPOSITORY repo;


    public REPOSITORY getRepo() {
        return repo;
    }

    @GetMapping("/{id}")
    public ENTITY getById(@PathVariable("id") String id) {
        return repo.findById(id).get();
    }

    @GetMapping
    public List<ENTITY> get() {
        return repo.findAll();
    }

    @PostMapping
    public String post(@RequestBody ENTITY object) {
        repo.save(object);
        return object.getId();
    }

    @PutMapping("/{id}")
    private void put(@PathVariable String id, @RequestBody ENTITY object) {
        if (!Objects.equals(id, object.getId())) {
            throw new RuntimeException("Requisição inválida! Verifique os IDs da entidade!");
        }
        repo.save(object);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

}
