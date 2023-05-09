package com.trer.group.controller;

import com.trer.group.bean.AuthCode;
import com.trer.group.model.Utente;
import com.trer.group.service.EmailSenderService;
import com.trer.group.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utente")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UtenteController {
	@Autowired
	private UtenteService utenteService;
	@Autowired
	private EmailSenderService emailSenderService;

	@Autowired
	private AuthCode authCode;

	@PostMapping("/add")
	public String add(@RequestBody Utente utente) throws Exception {
		try {
			if (utenteService.checkUserExits(utente.getUsername(), utente.getEmail()))
				emailSenderService.sendEmail(utente.getEmail());
			else
				throw new Exception("Email/Username already exists.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage().toString());
		}
		return "OK";
	}

	@PostMapping("/doAdd/{code}")
	public String doAdd(@RequestBody Utente utente, @PathVariable String code) throws Exception {
		if (code.equals(authCode.getAuthCode())) {
			utenteService.saveUtente(utente);
		}
		return "OK";
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
}
