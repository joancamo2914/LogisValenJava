package com.Logis.Valen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "bodegas")
public class Bodega {

    @Id
    private String Bodega;
    private String Usuario;
}