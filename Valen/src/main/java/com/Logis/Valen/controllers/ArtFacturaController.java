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

import com.Logis.Valen.dto.DtoArtFactura;
import com.Logis.Valen.entities.ArtFactura;
import com.Logis.Valen.repositories.RepoArtFacturas;
import com.Logis.Valen.services.ArtFacturaService;

@RestController
@RequestMapping("/api/artfacturas")
public class ArtFacturaController {

	@Autowired
	private RepoArtFacturas repoArtFacturas;

	@GetMapping
	public List<ArtFactura> verArtFactura() {
		return (List<ArtFactura>) repoArtFacturas.findAll();
	}	
	@Autowired
	public ArtFacturaService serviceArtFactura;
	
	@PostMapping
	public ResponseEntity<ArtFactura> crearArtFactura(@RequestBody DtoArtFactura artFacturaDto){
		ArtFactura artFacturaGuardada = serviceArtFactura.crearArtFactura(artFacturaDto);
		return new ResponseEntity<> (artFacturaGuardada, HttpStatus.CREATED);
	}
	
	
}