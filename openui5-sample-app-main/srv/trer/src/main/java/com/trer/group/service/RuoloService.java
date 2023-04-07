package com.trer.group.service;

import com.trer.group.model.Ruolo;

import java.util.List;

public interface RuoloService {
	public Ruolo getRole(Integer id);
	public List<Ruolo> getAllRoles();
	public Ruolo addRole(Ruolo ruolo);
}
