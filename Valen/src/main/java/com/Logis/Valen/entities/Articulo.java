package com.Logis.Valen.entities;

    import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Data;

    @Entity
    @Data
    @Table(name = "articulos")
public class Articulo {

    @Id
    private String Codigo;
    private String Descripcion;

    @Column(name="UnidadMayor")
    private String UnidadMayor;
    @Column (name="UnidadMenor")
    private String UnidadMenor;
    private float Peso;
    private float Conversion;

}
