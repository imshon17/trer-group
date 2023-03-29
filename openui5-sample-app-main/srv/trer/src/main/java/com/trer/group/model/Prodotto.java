package com.trer.group.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProdotto;
	private String nome;
	private String descr;
	private String prezzo;
	private Integer quantity;
	private String barCode;
	private String img;

	public Prodotto(){}
}
