package com.example.tiendaanime.mapper;

import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.models.ProductoModel;
import org.springframework.stereotype.Service;

@Service
public class ProductoMapper {

    public ProductoDto convertirModeloaDTO(ProductoModel productoModel) {
        return new ProductoDto().builder()
                .idProducto(productoModel.getIdProducto())
                .serie(productoModel.getSerie())
                .personaje(productoModel.getPersonaje())
                .stock(productoModel.getStock())
                .precio(productoModel.getPrecio())
                .build();

    }

    public ProductoModel ConvertirDTOaModelo (ProductoDto productoDto){
            ProductoModel productoModel = new ProductoModel();
            productoModel.setIdProducto(productoDto.getIdProducto());
            productoModel.setSerie(productoDto.getSerie());
            productoModel.setPersonaje(productoModel.getPersonaje());
            productoModel.setStock(productoModel.getStock());
            productoModel.setPrecio(productoDto.getPrecio());
            return productoModel;
    }
}