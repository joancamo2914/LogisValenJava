package com.Logis.Valen.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "facturas")
public class Factura {

	@jakarta.persistence.Id
	private String Id;
	private String Cliente, Vendedor;
	private int Peso, Valor;
	private LocalDate FechaFactura;
	@Column(name = "FechaRegistro", insertable = false, updatable = false)
	private LocalDateTime FechaRegistro;
}