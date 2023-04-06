package com.trer.group.controller;

import com.trer.group.model.Centro;
import com.trer.group.service.CentroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centro")
public class CentroController {
	@Autowired
	private CentroService centroService;

	@GetMapping("/getAll")
	public List<Centro> getAll() {
		return centroService.getAll();
	}

	@GetMapping("/get")
	public Centro get(@PathVariable Integer id) {
		return centroService.getCentro(id);
	}

	@PostMapping("/add")
	public Centro add(@RequestBody Centro centro) {
		return centroService.saveCentro(centro);
	}
}
