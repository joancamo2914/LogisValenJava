package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoArtFactura;
import com.Logis.Valen.entities.ArtFactura;
import com.Logis.Valen.repositories.RepoArtFacturas;

@Service
public class ArtFacturaService {

	@Autowired
	private RepoArtFacturas ArtFacturaRepository;
	
	public ArtFactura crearArtFactura(DtoArtFactura ArtFacturaDTO) {
		
		ArtFactura nuevaArtFactura = new ArtFactura();
		
		nuevaArtFactura.setId_factura(ArtFacturaDTO.getId_factura());
		nuevaArtFactura.setCodigo_art(ArtFacturaDTO.getCodigo_art());
		nuevaArtFactura.setUnidad(ArtFacturaDTO.getUnidad());
		nuevaArtFactura.setCod_bodega(ArtFacturaDTO.getCod_bodega());
		nuevaArtFactura.setCantidad(ArtFacturaDTO.getCantidad());
		
		return ArtFacturaRepository.save(nuevaArtFactura);
	}
}