package com.viamatica.prueba.repository;

import com.viamatica.prueba.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PeliculaCrudRepository extends JpaRepository<Pelicula, Integer> {

    Pelicula findByNombre(String nombre);





}
