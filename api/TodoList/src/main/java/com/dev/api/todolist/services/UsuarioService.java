package com.dev.api.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dev.api.todolist.model.Usuario;


public interface UsuarioService {

	 List<Usuario> listar();
	 Optional<Usuario> obtenerPorId(Long id);
	 Usuario guardar(Usuario usuario);
	 void eliminar(Long id);
	
}
