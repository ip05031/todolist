package com.dev.api.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.api.todolist.model.Usuario;
import com.dev.api.todolist.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired 
	UsuarioRepository repositorio;
	
	@Override
    @Transactional(readOnly = true)
	public List<Usuario> listar() {
        return (List<Usuario>) repositorio.findAll();
	}

	@Override
    @Transactional(readOnly = true)
	public Optional<Usuario> obtenerPorId(Long id) {
        return repositorio.findById(id);
	}

	@Override
    @Transactional
	public Usuario guardar(Usuario usuario) {
        return repositorio.save(usuario);
	}

	@Override
    @Transactional
	public void eliminar(Long id) {
		 repositorio.deleteById(id);
	}

}
