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
    private Long id_factura;
    @Column(name = "fecha")
    private Date fecha;

    @ManyToMany
    @JoinTable(name = "factura_producto",joinColumns=@JoinColumn(name = "id_factura"),
    inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<ProductoModel> productoModels;
}
