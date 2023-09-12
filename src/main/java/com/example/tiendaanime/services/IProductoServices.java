package com.example.tiendaanime.services;

import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.models.ProductoModel;

import java.util.List;

public interface IProductoServices {

    List<ProductoDto> optenerLosProductosPorPersonaje (String personaje);
    List<ProductoDto> obtenerLosProductosPorSerie (String serie);
    List<ProductoDto> obtenerProductosPorTipo (String tipo);
}
