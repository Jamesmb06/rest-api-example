package com.rest.example.restexample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Service
@Component
@RestController
@RequestMapping("/tienda")
public class ProductoGuardado {

    // Lista de productos estáticos que se ofrecen
    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return ProductoGuardado.getAllProductos();
    }
    private static List<Producto> productos = Arrays.asList(
            new Producto("iPhone 12 Pro", 1200000),
            new Producto("MacBook Pro", 1100000),
            new Producto("Samsung Galaxy S21 Ultra", 2150000),
            new Producto("PortÁtil ASUS ROG", 2000000),
            new Producto("Sony PlayStation 5", 2500000),
            new Producto("XBOX ONE", 1000000),
            new Producto("Diademas SoundCore", 400000),
            new Producto("Teclado Logitech", 200000),
            new Producto("Mouse Redragon", 100000),
            new Producto("Monitor LG", 700000)
    );

    // Método para obtener la lista completa de productos
    public static List<Producto> getAllProductos() {
        return productos;
    }
}
