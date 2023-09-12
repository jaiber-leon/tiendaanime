package com.example.tiendaanime.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "facura")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_factura")
    private Long idFactura;
    @Column(name = "fecha")
    private Date fecha;

    @ManyToMany
    @JoinTable(
            name = "factura_producto", // Nombre de la tabla de unión
            joinColumns = @JoinColumn(name = "idFactura"), // Columna en la tabla de unión que hace referencia a FacturaModel
            inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<ProductoModel> productoModels;
}
