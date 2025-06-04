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
import com.Logis.Valen.entities.Factura;
import com.Logis.Valen.repositories.RepoFacturas;
import com.Logis.Valen.services.FacturaService;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {
	
	@Autowired
	private RepoFacturas repositorio;
	
	@GetMapping
	public List<Factura> verFacturas(){
		return (List<Factura>) repositorio.findAll();
	}
	
	@Autowired
	private FacturaService serviceFactura;
	
	@PostMapping
	public ResponseEntity<Factura> crearFactura(@RequestBody DtoFactura facturaDto){
		Factura facturaGuardada = serviceFactura.crearFactura(facturaDto);
		return new ResponseEntity<>(facturaGuardada, HttpStatus.CREATED);
		
	}
}
