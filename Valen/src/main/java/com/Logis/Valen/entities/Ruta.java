package com.Logis.Valen.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rutas")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String ConductorId;
    private String VehiculoId;
    @Column(name = "FechaInicio", insertable = false, updatable = false)
    private LocalDateTime FechaInicio;
    @Column(name = "FechaFinal", insertable = false)
    private LocalDateTime FechaFinal;
    
}