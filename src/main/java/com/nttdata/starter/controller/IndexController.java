package com.nttdata.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import starter.Saludo;

@RestController
public class IndexController {
	
	@Autowired
	private Temperatura temperatura;
	
	@GetMapping("/mostrarTemperatura")
	public ResponseEntity<String> mostrarTemperatura(@RequestParam int temperaturaIn)
	{
		return new ResponseEntity<String>(HttpStatus.OK).ok(temperatura.mostrarTemperaturaC(temperaturaIn));
	}
	
	@GetMapping("/convertir")
	public ResponseEntity<String> convertir(@RequestParam int temperaturaf)
	{
		return new ResponseEntity<String>(HttpStatus.OK).ok(temperatura.mostrarTemperaturaC(temperaturaf));
	}
	
}
