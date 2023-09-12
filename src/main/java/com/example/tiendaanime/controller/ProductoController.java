package com.example.tiendaanime.controller;

import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.services.impl.ImpProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ImpProductoService impProductoService;

    @GetMapping("/optenerProductosPorPersonaje/{personaje}")
    public List<ProductoDto> optenerProductosPorPersonaje (@PathVariable String personaje){
            return impProductoService.optenerLosProductosPorPersonaje(personaje);
    }
    @GetMapping("/obtenertodoporserie/{serie}")
    public List<ProductoModel> obtenerTodoPorSerie (@PathVariable String serie){
        return impProductoService.obtenerLosProductosPorSerie(serie);
    }

    @GetMapping("/obtenerportipo/{tipo}")
    public List<ProductoModel> obtenerPorTipo (@PathVariable String tipo){
        return impProductoService.obtenerProductosPorTipo(tipo);
    }
}
