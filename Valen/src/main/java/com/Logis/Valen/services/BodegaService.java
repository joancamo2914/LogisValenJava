package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoBodega;
import com.Logis.Valen.entities.Bodega;
import com.Logis.Valen.repositories.RepoBodegas;

@Service
public class BodegaService {

	@Autowired
	private RepoBodegas bodegaRepository;
	
	public Bodega crearBodega(DtoBodega bodegaDTO) {
		
		Bodega nuevaBodega = new Bodega();
		
		nuevaBodega.setBodega(bodegaDTO.getBodega());
		nuevaBodega.setUsuario(bodegaDTO.getUsuario());
		return bodegaRepository.save(nuevaBodega);
	}
}