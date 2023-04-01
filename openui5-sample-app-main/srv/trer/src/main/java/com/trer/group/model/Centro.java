package com.trer.group.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Centro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCentro;
	private String name;
	private String address;
	private String email;
	private String telephoneNumber;
	private String pIva;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtente", referencedColumnName = "idUtente")
	private Utente idUtente;

	public Centro() {}



}
