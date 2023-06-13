package com.viamatica.prueba.service;

import com.viamatica.prueba.entity.PeliculaSalaCine;
import com.viamatica.prueba.repository.PeliculaSalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PeliculaSalaService {
    @Autowired
    private PeliculaSalaRepository peliculaSalaRepository;

    public List<PeliculaSalaCine> findByFechaPublicacion(LocalDateTime fecha){
        return peliculaSalaRepository.fingByFechaPublicaion(fecha);
    }
}
