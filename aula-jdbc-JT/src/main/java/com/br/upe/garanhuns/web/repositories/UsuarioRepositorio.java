package com.br.upe.garanhuns.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.upe.garanhuns.web.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}
