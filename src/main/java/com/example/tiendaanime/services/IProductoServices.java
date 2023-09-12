package com.example.tiendaanime.services;

import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.models.ProductoModel;

import java.util.List;

public interface IProductoServices {

    List<ProductoDto> optenerLosProductosPorPersonaje (String personaje);
    List<ProductoModel> obtenerLosProductosPorSerie (String serie);
    List<ProductoModel> obtenerProductosPorTipo (String tipo);
}
