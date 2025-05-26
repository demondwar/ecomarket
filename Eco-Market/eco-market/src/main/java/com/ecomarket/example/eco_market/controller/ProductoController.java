package com.ecomarket.example.eco_market.controller;

import com.ecomarket.example.eco_market.model.Producto;
import com.ecomarket.example.eco_market.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto p) {
        return ResponseEntity.ok(service.guardar(p));
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PutMapping
    public ResponseEntity<Producto> actualizar(@RequestBody Producto p) {
        return ResponseEntity.ok(service.actualizar(p));
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    } 
    
    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarPorId(@PathVariable Long id) {
        Producto producto = service.buscarPorId(id);
        if (producto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(producto);
    }
}