package com.rest.example.restexample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
@RestController
@RequestMapping("/tienda")
public class FacturasGuardadas {
    // Una lista estática para almacenar las facturas
    @PostMapping("/factura")
    public Factura agregarFactura(@RequestBody Factura factura) {
        FacturasGuardadas.addFactura(factura);
        return factura;
    }
    @GetMapping("/facturas")
    public List<Factura> obtenerFacturas() {
        return FacturasGuardadas.getFacturas();
    }
    private static List<Factura> facturas = new ArrayList<>();

    // Método estático para agregar una nueva factura a la lista de facturas
    public static void addFactura(Factura factura) {
        facturas.add(factura);
    }

    // Método para obtener la lista completa de facturas
    public static List<Factura> getFacturas() {
        return facturas;
    }
}
