package com.dev.api.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.api.todolist.model.Tarea;
import com.dev.api.todolist.model.Usuario;
import com.dev.api.todolist.repository.TareaRepository;
import com.dev.api.todolist.repository.UsuarioRepository;

@Service
public class TareaServiceImpl implements TareaService{

	@Autowired
	TareaRepository repositorio;
	
	@Autowired
	UsuarioRepository repositorio2;
	
	@Override
    @Transactional(readOnly = true)
	public List<Tarea> listar() {
        return (List<Tarea>) repositorio.findAll();
	}

	@Override
    @Transactional(readOnly = true)
	public List<Tarea> listarPorUsuario(Long id) {
		Optional<Usuario> usuario = repositorio2.findById(id);
		
		if( usuario.isPresent()) {
			Usuario u = usuario.get();
	        return (List<Tarea>) repositorio.findByUsuario(u);
		}
		return null;
	}
	
	
	@Override
    @Transactional(readOnly = true)
	public Optional<Tarea> obtenerPorId(Long id) {
		return repositorio.findById(id);
	}

	@Override
    @Transactional
	public Tarea guardar(Tarea tarea) {
		return repositorio.save(tarea);
	}

	@Override
    @Transactional
	public void eliminar(Long id) {
		repositorio.deleteById(id);
	}

}
