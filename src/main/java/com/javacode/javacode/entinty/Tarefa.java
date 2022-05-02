package com.javacode.javacode.entinty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotNull(message="{NotNull:Tarefa.nome}")
	private String nome;
	
	@Column
	@NotNull(message="{NotNull:Tarefa.descricao}")
	private String descricao;
	
	@Column
	@NotNull(message="{NotNull:Tarefa.descricao}")
	private Cliente cliente;
	
}
