package com.trer.group.controller;

import com.trer.group.model.Dipendente;
import com.trer.group.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {
	@Autowired
	private DipendenteService dipendenteService;


	@PostMapping("/save")
	public String add(@RequestBody Dipendente dipendente) {
		dipendenteService.saveDipendente(dipendente);
		return "dipendente creato";
	}

	@GetMapping("get/{id}")
	public Dipendente getDipendente(@PathVariable Integer id) {
		return dipendenteService.getDipendente(id);
	}
	@GetMapping("/getAll")
	public List<Dipendente> get() {
		return dipendenteService.getAllDipendente();
	}
}
