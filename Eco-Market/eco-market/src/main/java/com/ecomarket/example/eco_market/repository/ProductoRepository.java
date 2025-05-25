package com.ecomarket.example.eco_market.repository;

import com.ecomarket.example.eco_market.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}