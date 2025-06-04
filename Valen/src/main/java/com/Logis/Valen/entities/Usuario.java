package com.Logis.Valen.entities;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Data;

    @Entity
    @Data
    @Table(name = "usuarios")
public class Usuario {

    @Id
    private String Usuario;
    private String Password;
    private String Rol;
    
}
