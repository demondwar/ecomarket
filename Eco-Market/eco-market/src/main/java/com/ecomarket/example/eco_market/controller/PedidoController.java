package com.ecomarket.example.eco_market.controller;

import com.ecomarket.example.eco_market.model.Pedido;
import com.ecomarket.example.eco_market.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Pedido> guardar(@RequestBody Pedido o) {
        return ResponseEntity.ok(service.guardar(o));
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PutMapping("/{id}/autorizar")
    public ResponseEntity<Pedido> autorizar(@PathVariable Long id) {
        return ResponseEntity.ok(service.autorizarPedido(id));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        Pedido pedido = service.buscarPorId(id);
        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedido);
    }

}
