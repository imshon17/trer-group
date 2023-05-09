package com.trer.group.service;


import com.trer.group.model.Utente;
import com.trer.group.repository.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepo utenteRepo;


	public Utente saveUtente(Utente utente) {

		return utenteRepo.save(utente);
	}


	public Utente getUtente(Integer id) {
		Optional<Utente> aa = utenteRepo.findById(id);
		if (aa.isPresent()) {
			Utente ut = aa.get();
			return ut;
		} else {
			return null;
		}
	}
	
	public Boolean checkUserExits(String username, String email) {
		Utente utenteOpt = utenteRepo.findByUsernameOrEmail(username, email);
		if (utenteOpt == null)
			return true;
		else
			return false;
	}



	public List<Utente> getAll() {
		return utenteRepo.findAll();
	}


	public Utente getLoginCheck(String username, String password) {
		return utenteRepo.findByUsernameAndPassword(username, password);
	}
}
