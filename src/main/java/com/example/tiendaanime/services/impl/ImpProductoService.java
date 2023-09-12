package com.example.tiendaanime.services.impl;

import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.repository.IProductoRepository;
import com.example.tiendaanime.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProductoService implements IProductoServices {
    @Autowired
    IProductoRepository iProductoRepository;
    @Autowired
    ImpProductoService impProductoService;

    @Override
    public List<ProductoModel> optenerLosProductosPorPersonaje(String personaje) {

        return iProductoRepository.findAllByPersonaje(personaje);

    }

}
