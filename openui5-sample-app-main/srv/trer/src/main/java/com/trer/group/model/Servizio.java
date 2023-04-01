package com.trer.group.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "Servizio")
public class Servizio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServizio;
	private String nome;
	private String costo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtente", referencedColumnName = "idUtente")
	private Utente utente;
	private Double durata;
}
