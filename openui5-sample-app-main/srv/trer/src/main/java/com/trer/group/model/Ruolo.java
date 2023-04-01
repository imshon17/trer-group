package com.trer.group.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table(name = "Ruolo")
@Entity
public class Ruolo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRuolo;
	private String descrizione;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtente", referencedColumnName = "idUtente")
	private Utente utente;
}
