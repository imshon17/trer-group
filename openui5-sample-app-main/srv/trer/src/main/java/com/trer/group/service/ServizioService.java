package com.trer.group.service;

import com.trer.group.model.Servizio;

import java.util.List;

public interface ServizioService {
	public List<Servizio> getAll();
	public Servizio get(Integer id);
	public Servizio add(Servizio servizio);
}
