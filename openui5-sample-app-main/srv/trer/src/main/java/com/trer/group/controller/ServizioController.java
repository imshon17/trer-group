package com.trer.group.controller;

import com.trer.group.model.Servizio;
import com.trer.group.service.ServizioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servizio")
public class ServizioController {
	@Autowired
	private ServizioService servizioService;

	@GetMapping("/getAll")
	public List<Servizio> getAll() {
		return servizioService.getAll();
	}

	@GetMapping("/get/{id}")
	public Servizio get(@PathVariable Integer id) {
		return servizioService.get(id);
	}

	@PostMapping("/add")
	public Servizio add(@RequestBody Servizio servizio) {
		return servizioService.add(servizio);
	}
}
