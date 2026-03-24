package com.ph.tarefas.Services;

import com.ph.tarefas.Entity.TarefaEntity;
import com.ph.tarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    public TarefaRepository tarefaRepository;

    public List<TarefaEntity> findAll(){
        return tarefaRepository.findAll();
    }

    public TarefaEntity create(TarefaEntity tarefaEntity){
        return tarefaRepository.save(tarefaEntity);
    }

    public void delete(Long id){
        tarefaRepository.deleteById(id);
    }

    public Optional<TarefaEntity> findId(Long id){
        return tarefaRepository.findById(id);
    }
}
