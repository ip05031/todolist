package com.dev.api.todolist.services;

import java.util.List;
import java.util.Optional;

import com.dev.api.todolist.model.Tarea;


public interface TareaService {

	 List<Tarea> listar();
	 List<Tarea> listarPorUsuario(Long idUsuario);
	 
	 Optional<Tarea> obtenerPorId(Long id);
	 
	 Tarea guardar(Tarea tarea);
	 void eliminar(Long id);
}
