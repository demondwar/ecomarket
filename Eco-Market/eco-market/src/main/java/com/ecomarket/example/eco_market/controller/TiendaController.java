package com.ecomarket.example.eco_market.controller;

import com.ecomarket.example.eco_market.model.Tienda;
import com.ecomarket.example.eco_market.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendas")
public class TiendaController {

    @Autowired
    private TiendaService service;

    @PostMapping
    public ResponseEntity<Tienda> guardar(@RequestBody Tienda s) {
        return ResponseEntity.ok(service.guardar(s));
    }

    @GetMapping
    public ResponseEntity<List<Tienda>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PutMapping
    public ResponseEntity<Tienda> actualizar(@RequestBody Tienda s) {
        return ResponseEntity.ok(service.actualizar(s));
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tienda> obtenerPorId(@PathVariable Long id) {
        Tienda tienda = service.buscarPorId(id);
        if (tienda != null) {
            return ResponseEntity.ok(tienda);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tienda> buscarPorId(@PathVariable Long id) {
        Tienda tienda = service.buscarPorId(id);
        if (tienda == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tienda);
    }


}
