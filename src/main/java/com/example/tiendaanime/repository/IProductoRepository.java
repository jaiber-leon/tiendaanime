package com.example.tiendaanime.repository;

import com.example.tiendaanime.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long> {

    @Query(value = "SELECT * FROM producto p WHERE p.personaje = :personaje", nativeQuery = true)
    List<ProductoModel> findAllByPersonaje(@Param("personaje") String personaje);

    @Query(value = "SELECT * FROM producto p WHERE p.serie = :serie", nativeQuery = true)
    List<ProductoModel> findAllBySerie(@Param("serie")String serie);

    @Query(value = "SELECT p.*, t.tipo FROM producto p INNER JOIN tipo_producto t ON p.tipoproductoid = t.id_tipoProducto " +
            "WHERE t.tipo = :tipo",nativeQuery = true)
    List<ProductoModel> findAllByTipoProducto(@Param("tipo")String tipo);


}
