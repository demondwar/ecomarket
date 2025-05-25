package com.ecomarket.example.eco_market.service;

import com.ecomarket.example.eco_market.model.Producto;
import com.ecomarket.example.eco_market.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repo;

    public Producto guardar(Producto p) {
        return repo.save(p);
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    public Producto actualizar(Producto p) {
        return repo.save(p);
    }
    public Producto buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}