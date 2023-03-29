package com.trer.group.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Servizio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServizio;
	private String nome;
	private String costo;
	private Integer idUtente;
	private Double durata;
}
