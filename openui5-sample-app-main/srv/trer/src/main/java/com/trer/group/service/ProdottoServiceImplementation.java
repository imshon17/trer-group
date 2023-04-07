package com.trer.group.service;

import com.trer.group.model.Prodotto;
import com.trer.group.repository.ProdottoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProdottoServiceImplementation implements ProdottoService{
	@Autowired
	private ProdottoRepo prodottoRepo;

	@Override
	public Prodotto saveProdotto(Prodotto prodotto) {
		return prodottoRepo.save(prodotto);
	}

	@Override
	public List<Prodotto> getAll() {
		return prodottoRepo.findAll();
	}

	@Override
	public Prodotto getProdotto(Integer id) {
		Optional<Prodotto> optProd = prodottoRepo.findById(id);
		if (optProd.isPresent())
			return optProd.get();
		else
			return null;
	}
}
