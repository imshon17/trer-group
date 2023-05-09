package com.trer.group.service;

import com.trer.group.model.Servizio;
import com.trer.group.repository.ServizioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServizioService {
	@Autowired
	private ServizioRepo servizioRepo;

	public List<Servizio> getAll() {
		return servizioRepo.findAll();
	}

	public Servizio get(Integer id) {
		Optional<Servizio> optServizio = servizioRepo.findById(id);
		if (optServizio.isPresent())
			return optServizio.get();
		return null;
	}


	public Servizio add(Servizio servizio) {
		return servizioRepo.save(servizio);
	}
}
