package com.br.upe.garanhuns.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

public class Usuario implements Persistable<Long> {

	@Id
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	@Transient
	private Boolean isNew;

	public Usuario() {

	}

	public Usuario(Long id, String cpf, String nome, String email) {
		this();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.isNew = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public boolean isNew() {
		return isNew;
	}

}
