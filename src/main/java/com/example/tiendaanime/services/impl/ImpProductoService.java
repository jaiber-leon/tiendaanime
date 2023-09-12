package com.example.tiendaanime.services.impl;

import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.excepcions.ResourceNotFound;
import com.example.tiendaanime.mapper.ProductoMapper;
import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.repository.IProductoRepository;
import com.example.tiendaanime.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ImpProductoService implements IProductoServices {
    @Autowired
    private IProductoRepository iProductoRepository;
    @Autowired
    private ProductoMapper productoMapper;
    @Override
    public List<ProductoDto> optenerLosProductosPorPersonaje(String personaje) {
            List<ProductoModel> productoModel = iProductoRepository.findAllByPersonaje(personaje);
            List<ProductoDto> productoDtoList = new ArrayList<>();

        for (ProductoModel productoModel1 : productoModel){
            ProductoDto productoDto = productoMapper.convertirModeloaDTO(productoModel1);
            productoDtoList.add(productoDto);

           }
            return productoDtoList;
    }

    @Override
    public List<ProductoDto> obtenerLosProductosPorSerie(String serie) {
        List<ProductoModel> producto = iProductoRepository.findAllBySerie(serie);


        List<ProductoDto> productoDtoList = new ArrayList<>();
        for (ProductoModel productoModel : producto) {
            ProductoDto productoDto = productoMapper.convertirModeloaDTO(productoModel);
            productoDtoList.add(productoDto);
        }
            return productoDtoList;

    }


    @Override
    public List<ProductoModel> obtenerProductosPorTipo(String tipo) {
        List<ProductoModel> producto = iProductoRepository.findAllByTipoProducto(tipo);
        return producto;
    }

}
