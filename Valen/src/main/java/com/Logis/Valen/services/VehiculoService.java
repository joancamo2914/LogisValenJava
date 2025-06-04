package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoVehiculo;
import com.Logis.Valen.entities.Vehiculo;
import com.Logis.Valen.repositories.RepoVehiculos;

@Service
public class VehiculoService {

	@Autowired
	private RepoVehiculos VehiculoRepository;
	
	public Vehiculo crearVehiculo(DtoVehiculo VehiculoDTO) {
		
		Vehiculo nuevoVehiculo = new Vehiculo();
		
		nuevoVehiculo.setPlaca(VehiculoDTO.getPlaca());
		nuevoVehiculo.setCapacidad(VehiculoDTO.getCapacidad());
		nuevoVehiculo.setTipo(VehiculoDTO.getTipo());
		
		return VehiculoRepository.save(nuevoVehiculo);
	}
}