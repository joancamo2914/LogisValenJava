package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoFactura;
import com.Logis.Valen.entities.Factura;
import com.Logis.Valen.repositories.RepoFacturas;

@Service
public class FacturaService {

	@Autowired
	private RepoFacturas facturaRepository;
	
	public Factura crearFactura(DtoFactura facturaDTO) {
		Factura nuevaFactura = new Factura();
		
		nuevaFactura.setId(facturaDTO.getId());
		nuevaFactura.setCliente(facturaDTO.getCliente());
		nuevaFactura.setVendedor(facturaDTO.getVendedor());
		nuevaFactura.setPeso(facturaDTO.getPeso());
		nuevaFactura.setValor(facturaDTO.getValor());
		nuevaFactura.setFechaFactura(facturaDTO.getFechaFactura());
		return facturaRepository.save(nuevaFactura);
	}
}