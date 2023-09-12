package com.example.tiendaanime.dto;

import com.example.tiendaanime.models.ProductoModel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacturaDTO {

    private Long idFactura;

    private Date fecha;
    private List<ProductoModel> productoModels;


}
