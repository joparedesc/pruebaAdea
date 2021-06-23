package com.adea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adea.entity.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, String> {

}