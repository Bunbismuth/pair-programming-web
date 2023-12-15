package com.br.upe.garanhuns.web.jdbc.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.br.upe.garanhuns.web.jdbc.model.Usuario;

@SpringBootTest
@TestPropertySource("classpath:application-teste.properties")
public class UsuarioRepositorioTeste {

	@Autowired
	private UsuarioRepositorio usuarioRepo;

	@Test
	public void quandoSalvaClienteEntaoPersisistido() {
		Usuario usuario = new Usuario(423L, "02974201938", "Marcio da Carroçinha", "marcos@carroca.com", true);
		this.usuarioRepo.save(usuario);
		Usuario usuarioSalvo = this.usuarioRepo.findById(423L).get();
		assertNotNull(usuarioSalvo, "Deveria ter salvo o cliente");
	}

	@BeforeEach
	public void limparBase() {
		this.usuarioRepo.deleteAll();
	}
}
