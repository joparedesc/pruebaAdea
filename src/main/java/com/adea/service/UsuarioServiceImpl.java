package com.adea.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adea.dao.UsuarioDAO;
import com.adea.entity.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Transactional(readOnly=true)
	public Iterable<Usuario> findAll() {
		return usuarioDAO.findAll();
	}

	
	@Transactional(readOnly=true)
	public Page<Usuario> findAll(Pageable page) {
		return usuarioDAO.findAll(page);
	}

	@Transactional(readOnly=true)
	public Optional<Usuario> findById(String id) {
		return usuarioDAO.findById(id);
	}

	@Transactional
	public Usuario save(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}

	@Transactional
	public void deleteById(String id) {
		usuarioDAO.deleteById(id);
	}

}
