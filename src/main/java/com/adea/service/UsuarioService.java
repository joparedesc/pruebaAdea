package com.adea.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.adea.entity.Usuario;

public interface UsuarioService {
	
	public Iterable<Usuario>findAll();
	
	public Page<Usuario> findAll(Pageable page);
	
	public Optional<Usuario> findById(String id);
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(String id);
}
