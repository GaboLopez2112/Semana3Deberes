package com.uisrael.relacion.OneToOne.repository;

import com.uisrael.relacion.OneToOne.model.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepositoy extends JpaRepository<Gerente,Long> {

}
