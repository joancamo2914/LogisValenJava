package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoArticulo;
import com.Logis.Valen.entities.Articulo;
import com.Logis.Valen.repositories.RepoArticulos;

@Service
public class ArticuloService {

	@Autowired
	private RepoArticulos ArticuloRepository;
	
	public Articulo crearArticulo(DtoArticulo ArticuloDTO) {
		
		Articulo nuevoArticulo = new Articulo();
		
		nuevoArticulo.setCodigo(ArticuloDTO.getCodigo());
		nuevoArticulo.setDescripcion(ArticuloDTO.getDescripcion());
		nuevoArticulo.setUnidadMayor(ArticuloDTO.getUnidadMayor());
		nuevoArticulo.setPeso(ArticuloDTO.getPeso());
		nuevoArticulo.setConversion(ArticuloDTO.getConversion());
		
		return ArticuloRepository.save(nuevoArticulo);
	}
}