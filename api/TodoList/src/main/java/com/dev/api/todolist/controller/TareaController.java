package com.dev.api.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.api.todolist.model.Tarea;
import com.dev.api.todolist.model.Usuario;
import com.dev.api.todolist.services.TareaService;
import com.dev.api.todolist.services.TareaServiceImpl;

@RestController
public class TareaController {
	
	@Autowired
	TareaService servicio;
	
	
	   @GetMapping("/api/tareas/")
	    public List<Tarea> listar(){
	        return servicio.listar();
	    }
	    
	    @GetMapping("/api/tareas/{id}")
	    public ResponseEntity<?> detalle(@PathVariable Long id){
	            Optional<Tarea> usuarioOptional = servicio.obtenerPorId(id);
	            if( usuarioOptional.isPresent() ){
	                return ResponseEntity.ok().body(usuarioOptional.get());
	            }
	            return ResponseEntity.notFound().build();
	    }
	    
	    @GetMapping("/api/tareas/usuario/{id}")
	    public List<Tarea> detallePorUsuario(@PathVariable Long id){
	    	return servicio.listarPorUsuario(id);
	    }
	    
	    @PostMapping("/api/tareas/")
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity crear(@RequestBody Tarea tarea){
	        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.guardar(tarea));
	    }
	
	
}
