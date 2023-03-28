package com.trer.group.service;

import com.trer.group.model.Dipendente;

import java.util.List;

public interface DipendenteService {
	public Dipendente saveDipendente(Dipendente dipendente);
	public Dipendente getDipendente(Integer id);
	public List<Dipendente> getAllDipendente();
}
