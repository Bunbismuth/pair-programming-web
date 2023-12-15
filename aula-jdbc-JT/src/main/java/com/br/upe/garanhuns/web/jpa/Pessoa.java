package com.br.upe.garanhuns.web.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "jpa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

	@Id
	@Column(name = "id_pessoa")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Lob
	private byte[] foto;

	@Column(nullable = false, unique = true, length = 300)
	private String nome;

	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;

		if (this == obj) {
			iguais = true;
		} else if (obj instanceof Pessoa) {
			iguais = ((Pessoa) obj).getNome().equalsIgnoreCase(this.nome);
		}

		return iguais;
	}
}
