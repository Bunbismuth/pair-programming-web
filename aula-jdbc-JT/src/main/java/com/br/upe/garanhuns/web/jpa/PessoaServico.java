package com.br.upe.garanhuns.web.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class PessoaServico {

	@Autowired
	private PessoaRepositorio repo;

	public void salvar(Pessoa pessoa) {
		if (pessoa == null) {
			throw new RuntimeException("A pessoa deve ser informada");
		}

		if (pessoa.getNome() == null || pessoa.getNome().isBlank()) {
			throw new RuntimeException("O nome da pessoa deve ser informado");
		}

		Optional<Pessoa> pessoaExistente = repo.findByNome(pessoa.getNome());

		if (pessoaExistente.isPresent()) {
			throw new RuntimeException("Já existe uma pessoa cadastrada com o nome " + pessoa.getNome());
		}

		repo.save(pessoa);
	}
}
