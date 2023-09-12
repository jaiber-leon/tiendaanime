package com.example.tiendaanime.services;

import com.example.tiendaanime.models.ProductoModel;

import java.util.List;

public interface IProductoServices {

    List<ProductoModel> optenerLosProductosPorPersonaje (String personaje);
    List<ProductoModel> obtenerLosProductosPorSerie (String serie);
}
