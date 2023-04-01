package com.trer.group.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProdotto;
	@Column(name = "nome")
	private String nome;
	@Column(name = "descr")
	private String descr;
	@Column(name = "prezzo")
	private String prezzo;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "barCode")
	private String barCode;
	@Column(name = "img")
	private String img;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCentro", referencedColumnName = "idCentro")
	private Centro idCentro;

	public Prodotto(){}
}
