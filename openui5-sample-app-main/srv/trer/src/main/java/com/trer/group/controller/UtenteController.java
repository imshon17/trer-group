package com.trer.group.controller;

import com.trer.group.model.Utente;
import com.trer.group.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utente")
public class UtenteController {
	@Autowired
	private UtenteService utenteService;


	@PostMapping("/add")
	public String add(@RequestBody Utente utente) {
		utenteService.saveUtente(utente);
		return "utente creato";
	}

	@GetMapping("/get/{id}")
	public Utente get(@PathVariable Integer id) {
		return utenteService.getUtente(id);
	}

	@GetMapping("/getAll")
	public List<Utente> getAll() {
		return utenteService.getAll();
	}


	@GetMapping("/getLogin/{username}/{password}")
	public Utente getLogin(@PathVariable String username, @PathVariable String password) {
		return utenteService.getLoginCheck(username, password);
	}


	/*@GetMapping("/getDipendenti/{role}/{idCentro}")
	public List<Utente> getAllDipendenti(@PathVariable String role, @PathVariable Integer idCentro) {
		return utenteService.getAllDipendenti(role, idCentro);
	}*/
}
