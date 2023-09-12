package com.example.tiendaanime.services.impl;

import com.example.tiendaanime.excepcions.ResourceNotFound;
import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.repository.IProductoRepository;
import com.example.tiendaanime.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ImpProductoService implements IProductoServices {
    @Autowired
    private IProductoRepository iProductoRepository;
    @Override
    public List<ProductoModel> optenerLosProductosPorPersonaje(String personaje) {
           if (personaje == null || personaje.isEmpty()){
            return Collections.EMPTY_LIST;
               }
           List<ProductoModel> producto = iProductoRepository.findAllByPersonaje(personaje);
           return producto;

    }

    @Override
    public List<ProductoModel> obtenerLosProductosPorSerie(String serie) {
        try {
            List<ProductoModel> producto = iProductoRepository.findAllBySerie(serie);
            return producto;
        }catch (Exception e){
            throw new ResourceNotFound("no se encontro productos con la serie indicada: "+serie);
        }
        }

    @Override
    public List<ProductoModel> obtenerProductosPorTipo(String tipo) {
        List<ProductoModel> producto = iProductoRepository.findAllByTipoProducto(tipo);
        return producto;
    }

}
