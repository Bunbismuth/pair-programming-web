package com.br.upe.garanhuns.web.jpa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long> {

	public Optional<Pessoa> findByNome(String name);

}
