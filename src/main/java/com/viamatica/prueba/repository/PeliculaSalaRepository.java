package com.viamatica.prueba.repository;

import com.viamatica.prueba.entity.PeliculaSalaCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PeliculaSalaRepository extends JpaRepository<PeliculaSalaCine, Integer> {

   List<PeliculaSalaCine> fingByFechaPublicaion(LocalDateTime fecha);
}
