package com.Logis.Valen.dto;

import lombok.Data;

@Data
public class DtoArtEntregados {

    private int Id;
    private int IdRuta;
    private String IdFactura;
    private String IdArticulo;
    private float Cantidad;
    private String Unidad;
    private String Cod_bodega;
    
}
