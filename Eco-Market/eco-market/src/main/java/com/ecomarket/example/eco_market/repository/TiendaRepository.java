package com.ecomarket.example.eco_market.repository;

import com.ecomarket.example.eco_market.model.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiendaRepository extends JpaRepository<Tienda, Long> {
}