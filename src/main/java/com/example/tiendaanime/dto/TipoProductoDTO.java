package com.example.tiendaanime.dto;

import com.example.tiendaanime.models.FacturaModel;
import com.example.tiendaanime.models.ProductoModel;
import com.example.tiendaanime.models.TipoProductoModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TipoProductoDTO {

    private Long idTipoproducto;

    private String tipo;

    private String descripcion;

}
