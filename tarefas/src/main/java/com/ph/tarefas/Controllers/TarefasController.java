package com.ph.tarefas.Controllers;

import com.ph.tarefas.Entity.TarefaEntity;
import com.ph.tarefas.Services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    @Autowired
    public TarefaService tarefaService;

    @PostMapping
    public TarefaEntity create(@RequestBody TarefaEntity tarefaEntity){
        return tarefaService.create(tarefaEntity);
    }

    @GetMapping
    public List<TarefaEntity> findAll(){
        return tarefaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TarefaEntity> findById(@PathVariable Long id){
        return tarefaService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        tarefaService.delete(id);
    }
}

