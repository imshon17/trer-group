package com.trer.group.service;

import com.trer.group.model.Ruolo;
import com.trer.group.repository.RuoloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RuoloServiceImplementation implements  RuoloService  {
	@Autowired
	private RuoloRepo ruoloRepo;
	@Override
	public Ruolo getRole(Integer id) {
		Optional<Ruolo> optRuolo = ruoloRepo.findById(id);
		if (optRuolo.isPresent())
			return optRuolo.get();
		return null;
	}

	@Override
	public List<Ruolo> getAllRoles() {
		return ruoloRepo.findAll();
	}

	@Override
	public Ruolo addRole(Ruolo ruolo) {
		return ruoloRepo.save(ruolo);
	}
}
