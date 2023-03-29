package com.trer.group.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Appuntamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAppuntamento;
	private Integer idUtente;
	private String dataAppuntamento;
	private String oraPrenotazione;
	private Integer idCentro;
	private Integer idServizio;

	public Appuntamento(){}
}
