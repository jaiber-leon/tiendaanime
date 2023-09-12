package com.example.tiendaanime.dto;

import com.example.tiendaanime.models.FacturaModel;
import com.example.tiendaanime.models.TipoProductoModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDto {
    private Long idProducto;

    private String serie;
    private String personaje;
    private TipoProductoModel tipoProducto;
    private Long stock;
    private double precio;
    private List<FacturaModel> facturas;

}
