package com.viamatica.prueba.repository;

import com.viamatica.prueba.entity.SalaCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaCineCrudRepository extends JpaRepository<SalaCine, Integer> {


    @Query("FROM SalaCine sc WHERE sc.nombre = ?1")
    SalaCine buscarPorNombre(String nombre);

}
