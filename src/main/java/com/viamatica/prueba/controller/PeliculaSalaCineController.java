package com.viamatica.prueba.controller;

import com.viamatica.prueba.entity.PeliculaSalaCine;
import com.viamatica.prueba.service.PeliculaSalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/peliculasala")
public class PeliculaSalaCineController {
    @Autowired
    private PeliculaSalaService peliculaSalaService;
    @GetMapping("/{fecha}")
    public List<PeliculaSalaCine> findByFechaPublicacion(@PathVariable("fecha") LocalDateTime fecha){
        return peliculaSalaService.findByFechaPublicacion(fecha);
    }

}
