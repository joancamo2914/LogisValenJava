package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoArtEntregados;
import com.Logis.Valen.entities.ArtEntregados;
import com.Logis.Valen.repositories.RepoArtEntregados;

@Service
public class ArtEntregadoService {

	@Autowired
	private RepoArtEntregados artEntregadosRepository;
	
	public ArtEntregados crearArtEntregado(DtoArtEntregados artEntregadosDto) {
		
		ArtEntregados nuevoArtEntregado = new ArtEntregados();
		
		nuevoArtEntregado.setIdRuta(artEntregadosDto.getIdRuta());
		nuevoArtEntregado.setIdArticulo(artEntregadosDto.getIdArticulo());
		nuevoArtEntregado.setIdFactura(artEntregadosDto.getIdFactura());
		nuevoArtEntregado.setCantidad(artEntregadosDto.getCantidad());
		
		return artEntregadosRepository.save(nuevoArtEntregado);
	}
	
	
}
