package com.trer.group.controller;

import com.trer.group.model.Appuntamento;
import com.trer.group.service.AppuntamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appuntamento")
public class AppuntamentoController {
	@Autowired
	private AppuntamentoService appuntamentoService;

	@GetMapping("/getAll")
	public List<Appuntamento> getAll() {
		return appuntamentoService.getAll();
	}

	@GetMapping("/get/{id}")
	public Appuntamento get(@PathVariable Integer id) {
		return appuntamentoService.get(id);
	}

	@PostMapping("/add")
	public Appuntamento add(Appuntamento appuntamento) {
		return appuntamentoService.save(appuntamento);
	}
}
