package com.ecomarket.example.eco_market.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String direccion;
    private String horario;
    private String politica;
}
