package com.dev.api.todolist.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.api.todolist.model.Tarea;
import com.dev.api.todolist.model.Usuario;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long>{
	List<Tarea> findByUsuario(Usuario usuario);
}
