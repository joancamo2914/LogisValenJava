package com.Logis.Valen.entities;

import lombok.Data;

@Data
public class ArtEntregados {

	private int id;
	private int idRuta;
	private String idFactura;
	private String idArticulo;
	private float Cantidad;
	private String Unidad;
}
