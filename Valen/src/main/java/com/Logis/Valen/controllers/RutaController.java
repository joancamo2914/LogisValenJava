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

import com.Logis.Valen.dto.DtoFactura;
import com.Logis.Valen.dto.DtoRuta;
import com.Logis.Valen.entities.Factura;
import com.Logis.Valen.entities.Ruta;
import com.Logis.Valen.repositories.RepoRutas;
import com.Logis.Valen.services.FacturaService;
import com.Logis.Valen.services.RutaService;

@RestController
@RequestMapping("/api/rutas")
public class RutaController {
	
	@Autowired
	private RepoRutas repoRutas;

	@GetMapping
	public List<Ruta> verRuta() {
		return (List<Ruta>) repoRutas.findAll();
	}

	@Autowired
	private RutaService serviceRuta;
	
	@PostMapping
	public ResponseEntity<Ruta> crearRuta(@RequestBody DtoRuta rutaDto){
		Ruta rutaGuardada = serviceRuta.crearRuta(rutaDto);
		return new ResponseEntity<>(rutaGuardada, HttpStatus.CREATED);
}
}