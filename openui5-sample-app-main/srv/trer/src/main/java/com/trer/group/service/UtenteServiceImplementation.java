package com.trer.group.service;


import com.trer.group.model.Utente;
import com.trer.group.repository.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteServiceImplementation implements UtenteService {

	@Autowired
	private UtenteRepo utenteRepo;

	@Override
	public Utente saveUtente(Utente utente) {

		return utenteRepo.save(utente);
	}

	@Override
	public Utente getUtente(Integer id) {
		Optional<Utente> aa = utenteRepo.findById(id);
		if (aa.isPresent()) {
			Utente ut = aa.get();
			return ut;
		} else {
			return null;
		}
	}


	@Override
	public List<Utente> getAll() {
		return utenteRepo.findAll();
	}

	@Override
	public Utente getLoginCheck(String username, String password) {
		return utenteRepo.findByUsernameAndPassword(username, password);
	}
}
