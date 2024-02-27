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

import com.dev.api.todolist.services.UsuarioService;
import com.dev.api.todolist.model.Usuario;

@RestController
public class UsuarioController {


    @Autowired
    private UsuarioService service;
    
    @GetMapping("/api/usuarios/")
    public List<Usuario> listar(){
        return service.listar();
    }
    
    @GetMapping("/api/usuarios/{id}")
    public ResponseEntity<?> detalle(@PathVariable Long id){
            Optional<Usuario> usuarioOptional = service.obtenerPorId(id);
            if( usuarioOptional.isPresent() ){
                return ResponseEntity.ok().body(usuarioOptional.get());
            }
            return ResponseEntity.notFound().build();
    }
    
    @PostMapping("/api/usuarios/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity crear(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.guardar(usuario));
    }
}
