package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoRuta;
import com.Logis.Valen.entities.Ruta;
import com.Logis.Valen.repositories.RepoRutas;

@Service
public class RutaService {

	@Autowired
	private RepoRutas rutaRepository;
	
	public Ruta crearRuta(DtoRuta rutaDTO) {
		
		Ruta nuevaRuta = new Ruta();
		
		nuevaRuta.setVehiculoId(rutaDTO.getVehiculoId());
		nuevaRuta.setConductorId(rutaDTO.getConductorId());
		return rutaRepository.save(nuevaRuta);
	}
}
