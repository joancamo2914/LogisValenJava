package com.Logis.Valen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "artfacturas")
public class ArtFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Id_factura;
    private String Codigo_art;
    private float Cantidad;
    private String Unidad;
    private String Cod_bodega;
}
