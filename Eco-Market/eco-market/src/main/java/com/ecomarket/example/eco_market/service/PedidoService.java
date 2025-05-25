package com.ecomarket.example.eco_market.service;

import com.ecomarket.example.eco_market.model.Pedido;
import com.ecomarket.example.eco_market.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repo;

    public Pedido guardar(Pedido o) {
        return repo.save(o);
    }

    public List<Pedido> listar() {
        return repo.findAll();
    }

    public Pedido autorizarPedido(Long id) {
        Pedido pedido = repo.findById(id).orElseThrow();
        pedido.setAutorizado(true);
        return repo.save(pedido);
    }
    public Pedido buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

}