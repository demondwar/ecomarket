package com.ecomarket.example.eco_market.repository;

import com.ecomarket.example.eco_market.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}