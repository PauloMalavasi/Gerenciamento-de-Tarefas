package com.ph.tarefas.Repository;

import com.ph.tarefas.Entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository <TarefaEntity, Long> {
}
