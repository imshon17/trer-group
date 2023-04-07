package com.trer.group.service;

import com.trer.group.model.Appuntamento;
import com.trer.group.repository.AppuntamentoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppuntamentoServiceImplementation implements AppuntamentoService {
	@Autowired
	private AppuntamentoRepo appuntamentoRepo;

	@Override
	public Appuntamento get(Integer id) {
		return appuntamentoRepo.getById(id);
	}

	@Override
	public List<Appuntamento> getAll() {
		return appuntamentoRepo.findAll();
	}

	@Override
	public Appuntamento save(Appuntamento appuntamento) {
		return appuntamentoRepo.save(appuntamento);
	}
}
