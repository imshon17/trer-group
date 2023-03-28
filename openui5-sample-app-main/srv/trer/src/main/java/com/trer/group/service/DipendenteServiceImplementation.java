package com.trer.group.service;

import com.trer.group.model.Dipendente;
import com.trer.group.model.Utente;
import com.trer.group.repository.DipendenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DipendenteServiceImplementation implements  DipendenteService{
	@Autowired
	private DipendenteRepo dipendenteRepo;
	@Override
	public Dipendente saveDipendente(Dipendente dipendente) {
		return dipendenteRepo.save(dipendente);
	}

	@Override
	public List<Dipendente> getAllDipendente() {
		return dipendenteRepo.findAll();
	}

	@Override
	public Dipendente getDipendente(Integer id) {
		Optional<Dipendente> checkDipendente = dipendenteRepo.findById(id);
		if (checkDipendente.isPresent()) {
			return checkDipendente.get();
		} else {
			return null;
		}
	}


}
