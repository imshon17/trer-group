package com.trer.group.service;

import com.trer.group.model.Prodotto;

import java.util.List;

public interface ProdottoService {

	public Prodotto saveProdotto(Prodotto prodotto);
	public List<Prodotto> getAll();
	public Prodotto getProdotto(Integer id);
}
