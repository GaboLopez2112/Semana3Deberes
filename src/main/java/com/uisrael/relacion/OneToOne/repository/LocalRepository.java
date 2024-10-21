package com.uisrael.relacion.OneToOne.repository;

import com.uisrael.relacion.OneToOne.model.Gerente;
import com.uisrael.relacion.OneToOne.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {
}
