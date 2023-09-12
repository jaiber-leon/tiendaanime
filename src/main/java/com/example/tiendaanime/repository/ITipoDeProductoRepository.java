package com.example.tiendaanime.repository;

import com.example.tiendaanime.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDeProductoRepository extends JpaRepository<ProductoModel, Long> {
}
