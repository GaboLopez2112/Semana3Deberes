package com.uisrael.relacion.OneToOne.repository;

import com.uisrael.relacion.OneToOne.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Long> {
}
