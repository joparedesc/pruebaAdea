package com.adea;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.adea.dao.UsuarioDAO;
import com.adea.entity.Usuario;

@SpringBootTest
class PruebaAdeaApplicationTests {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired 
	private BCryptPasswordEncoder econder;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void crearUsuarioTest() {
		Usuario usuario=new Usuario();
		usuario.setLogin("joparedesc");
		usuario.setNombre("Jesus");
		usuario.setPassword(econder.encode("123"));
		//usuario.setPassword("123");
		
		Usuario usuarioRetorno=usuarioDAO.save(usuario);
		assertTrue(usuarioRetorno.getPassword().equalsIgnoreCase(usuario.getPassword()));
	}
	

}
