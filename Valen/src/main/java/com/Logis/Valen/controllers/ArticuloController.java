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
import com.Logis.Valen.dto.DtoArticulo;
import com.Logis.Valen.entities.ArtFactura;
import com.Logis.Valen.entities.Articulo;
import com.Logis.Valen.entities.Factura;
import com.Logis.Valen.repositories.RepoArticulos;
import com.Logis.Valen.repositories.RepoFacturas;
import com.Logis.Valen.services.ArtFacturaService;
import com.Logis.Valen.services.ArticuloService;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {
	
	@Autowired
	private RepoArticulos repositorio;
	
	@GetMapping
	public List<Articulo> verArticulos(){
		return (List<Articulo>) repositorio.findAll();
	}
	
	@Autowired
	public ArticuloService serviceArticulo;
	
	@PostMapping
	public ResponseEntity<Articulo> crearArticulo(@RequestBody DtoArticulo ArticuloDto){
		Articulo ArticuloGuardada = serviceArticulo.crearArticulo(ArticuloDto);
		return new ResponseEntity<> (ArticuloGuardada, HttpStatus.CREATED);
	}
}