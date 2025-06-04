package com.Logis.Valen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Logis.Valen.dto.DtoBodega;
import com.Logis.Valen.entities.Bodega;
import com.Logis.Valen.repositories.RepoBodegas;
import com.Logis.Valen.services.BodegaService;

@RestController
@RequestMapping("/api/bodegas")
public class BodegaController {
	
	@Autowired
	private RepoBodegas repoBodegas;

	@GetMapping
	public List<Bodega> verBodegas() {
		return (List<Bodega>) repoBodegas.findAll();
	}
	
	@Autowired
	private BodegaService serviceBodega;
	
	@PostMapping
	public ResponseEntity<Bodega> crearBodega(@RequestBody DtoBodega bodegaDto){
		Bodega bodegaGuardada = serviceBodega.crearBodega(bodegaDto);
		return new ResponseEntity<>(bodegaGuardada, HttpStatus.CREATED);
	}
}
