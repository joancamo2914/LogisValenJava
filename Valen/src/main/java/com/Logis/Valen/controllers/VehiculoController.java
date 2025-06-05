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

import com.Logis.Valen.dto.DtoVehiculo;
import com.Logis.Valen.entities.Vehiculo;
import com.Logis.Valen.repositories.RepoVehiculos;
import com.Logis.Valen.services.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
	
	@Autowired
	private RepoVehiculos repoVehiculos;

	@GetMapping
	public List<Vehiculo> verVehiculo() {
		return (List<Vehiculo>) repoVehiculos.findAll();
	}
	
	@Autowired
	public VehiculoService serviceVehiculo;
	
	@PostMapping
	public ResponseEntity<Vehiculo> crearVehiculo(@RequestBody DtoVehiculo VehiculoDto){
		Vehiculo VehiculoGuardada = serviceVehiculo.crearVehiculo(VehiculoDto);
		return new ResponseEntity<> (VehiculoGuardada, HttpStatus.CREATED);
	}
}