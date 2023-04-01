package com.trer.group.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
@Table(name = "Utenti")
@Entity
public class Utente  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUtente;
	private String name;
	private String surname;
	private String email;
	private String telNumber;
	private String username;
	private String password;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRuolo", referencedColumnName = "idRuolo")
	private Ruolo role;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCentro", referencedColumnName = "idCentro")
	private Centro centro;
	public Utente() {}
}
