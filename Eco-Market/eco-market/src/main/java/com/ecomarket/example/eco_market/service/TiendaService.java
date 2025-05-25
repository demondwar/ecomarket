package com.ecomarket.example.eco_market.service;

import com.ecomarket.example.eco_market.model.Tienda;
import com.ecomarket.example.eco_market.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository repo;

    public Tienda guardar(Tienda s) {
        return repo.save(s);
    }

    public List<Tienda> listar() {
        return repo.findAll();
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    public Tienda actualizar(Tienda s) {
        return repo.save(s);
    }
    public Tienda buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }


}
