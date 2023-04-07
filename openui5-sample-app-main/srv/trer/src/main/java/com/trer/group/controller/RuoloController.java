package com.trer.group.controller;

import com.trer.group.model.Ruolo;
import com.trer.group.service.RuoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ruolo")
public class RuoloController {
	@Autowired
	private RuoloService ruoloService;

	@GetMapping("/getAll")
	public List<Ruolo> getAll() {
		return ruoloService.getAllRoles();
	}

	@GetMapping("/add")
	public Ruolo add(@RequestBody Ruolo ruolo) {
		return ruoloService.addRole(ruolo);
	}

	@GetMapping("/get/{id}")
	public Ruolo get(Integer id) {
		return ruoloService.getRole(id);
	}
}
