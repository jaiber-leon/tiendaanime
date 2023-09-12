package com.example.tiendaanime.controller;

import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.services.impl.ImpProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ImpProductoService impProductoService;

    @GetMapping("/optenerProductosPorPersonaje/{personaje}")
    public List<ProductoModel> optenerProductosPorPersonaje (@PathVariable String personaje){
        return impProductoService.optenerLosProductosPorPersonaje(personaje);
    }
}
