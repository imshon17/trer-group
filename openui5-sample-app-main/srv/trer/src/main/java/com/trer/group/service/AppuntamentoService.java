package com.trer.group.service;

import com.trer.group.model.Appuntamento;

import java.util.List;

public interface AppuntamentoService {
	public Appuntamento get(Integer id);
	public List<Appuntamento> getAll();
	public Appuntamento save(Appuntamento appuntamento);
}
