package com.telefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.model.Modelagem;
import com.telefonica.repository.Repositorio;


@RestController
@RequestMapping("/id")
public class Controlador { 	

	@Autowired
	public Repositorio repositorio;

	@GetMapping
	public List  listarJobs(@RequestParam("id") Long id) {

		return   repositorio.findAll();
	}

	@PostMapping 
	public Modelagem popular(@RequestBody Modelagem modelagem) {
		return repositorio.save(modelagem);

	}

}
