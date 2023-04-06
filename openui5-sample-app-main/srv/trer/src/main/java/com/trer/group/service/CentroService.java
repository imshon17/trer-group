package com.trer.group.service;

import com.trer.group.model.Centro;

import java.util.List;

public interface CentroService {
	public Centro getCentro(Integer id);

	public List<Centro> getAll();

	public Centro saveCentro(Centro centro);

}
