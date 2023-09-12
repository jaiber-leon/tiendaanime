package com.example.tiendaanime.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "producto")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "serie", nullable = false)
    private String serie;

    @Column(name = "personaje", nullable = false)
    private String personaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tipoproductoid",referencedColumnName = "idTipoproducto")
    private TipoProductoModel tipoProducto; // Nombre del atributo debe coincidir con mappedBy en TipoProductoModel

    @Column(name = "stock")
    private Long stock;

    @Column(name = "precio")
    private double precio;

    @ManyToMany(mappedBy = "productoModels")
    private List<FacturaModel> facturas;
}
