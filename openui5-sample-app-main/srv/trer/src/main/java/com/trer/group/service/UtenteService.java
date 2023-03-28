package com.trer.group.service;

import com.trer.group.model.Utente;

import java.util.List;

public interface UtenteService {
	public Utente saveUtente(Utente utente);
	public Utente getUtente(Integer id);
	public Utente getLoginCheck(String username, String password);

	public List<Utente> getAll();
}
