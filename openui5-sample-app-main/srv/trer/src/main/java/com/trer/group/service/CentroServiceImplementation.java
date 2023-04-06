package com.trer.group.service;

import com.trer.group.model.Centro;
import com.trer.group.repository.CentroRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CentroServiceImplementation implements CentroService{
	@Autowired
	private CentroRepo centroRepo;
	@Override
	public Centro getCentro(Integer id) {
		Optional<Centro> optCentro = centroRepo.findById(id);
		if (optCentro.isPresent())
			return optCentro.get();
		else
			return null;
	}

	@Override
	public List<Centro> getAll() {
		return centroRepo.findAll();
	}

	@Override
	public Centro saveCentro(Centro centro) {
		return centroRepo.save(centro);
	}
}
