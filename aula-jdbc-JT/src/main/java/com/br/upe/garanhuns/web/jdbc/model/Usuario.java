package com.br.upe.garanhuns.web.jdbc.model;

import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Persistable<Long> {

	@Id
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	@Transient
	private Boolean isNew = true;

	@Override
	public boolean isNew() {
		return isNew;
	}

}
