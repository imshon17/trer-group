package com.trer.group.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Appuntamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAppuntamento;
	private String dataAppuntamento;
	private String oraPrenotazione;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCentro", referencedColumnName = "idCentro")
	private Centro idCentro;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idServizio", referencedColumnName = "idServizio")
	private Servizio idServizio;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtente", referencedColumnName = "idUtente")
	private Utente idUtente;


	public Appuntamento(){}
}
