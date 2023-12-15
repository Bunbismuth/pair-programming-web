package com.br.upe.garanhuns.web.jdbc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.upe.garanhuns.web.jdbc.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}
