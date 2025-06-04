package com.Logis.Valen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    private String Placa;
    private Short Capacidad;
    private String Tipo;
}
