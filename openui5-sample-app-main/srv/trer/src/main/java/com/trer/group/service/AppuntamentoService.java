package com.trer.group.service;

import com.trer.group.model.Appuntamento;
import com.trer.group.repository.AppuntamentoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppuntamentoService {
	@Autowired
	private AppuntamentoRepo appuntamentoRepo;

	public Appuntamento get(Integer id) {

		return appuntamentoRepo.getById(id);
	}
	public List<Appuntamento> getAll() {

		return appuntamentoRepo.findAll();
	}

	public Appuntamento save(Appuntamento appuntamento) {

		return appuntamentoRepo.save(appuntamento);
	}
}
