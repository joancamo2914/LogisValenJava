package com.Logis.Valen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Logis.Valen.entities.Vehiculo;
import com.Logis.Valen.repositories.RepoVehiculos;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
	
	@Autowired
	private RepoVehiculos repoVehiculos;

	@GetMapping
	public List<Vehiculo> verVehiculo() {
		return (List<Vehiculo>) repoVehiculos.findAll();
	}
}