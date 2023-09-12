package com.example.tiendaanime.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "serie",nullable = false)
    private String serie;
    @Column(name = "personaje",nullable = false)
    private String personaje;
    @ManyToOne
    @JoinColumn(name = "id_tipoproducto")
    private TipoProductoModel tipoProducto;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "precio")
    private double precio;

}
