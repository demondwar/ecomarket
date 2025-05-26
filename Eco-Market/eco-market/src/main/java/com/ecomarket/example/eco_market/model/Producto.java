package com.ecomarket.example.eco_market.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int stock;
    private double precio;

}
