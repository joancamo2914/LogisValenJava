package com.Logis.Valen.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DtoFactura {
	private String Id;
	private String Cliente, Vendedor;
	private int Peso, Valor;
	private LocalDate FechaFactura;
}
