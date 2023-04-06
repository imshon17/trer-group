package com.trer.group.controller;

import com.trer.group.model.Prodotto;
import com.trer.group.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prodotto")
public class ProdottoController {
	@Autowired
	private ProdottoService prodottoService;

	@GetMapping("/getAll")
	public List<Prodotto> getAll() {
		return prodottoService.getAll();
	}

	@GetMapping("/get/{id}")
	public Prodotto get(@PathVariable Integer id) {
		return prodottoService.getProdotto(id);
	}

	@PostMapping("/add")
	public Prodotto save(@RequestBody Prodotto prodotto) {
		return prodottoService.saveProdotto(prodotto);
	}
}
