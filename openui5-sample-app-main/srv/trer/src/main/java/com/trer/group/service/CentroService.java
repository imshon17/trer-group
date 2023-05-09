package com.trer.group.service;

import com.trer.group.model.Centro;
import com.trer.group.repository.CentroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CentroService {
	@Autowired
	private CentroRepo centroRepo;

	public Centro getCentro(Integer id) {
		Optional<Centro> optCentro = centroRepo.findById(id);
		if (optCentro.isPresent())
			return optCentro.get();
		else
			return null;
	}

	public List<Centro> getAll() {
		return centroRepo.findAll();
	}

	public Centro saveCentro(Centro centro) {
		return centroRepo.save(centro);
	}
}
