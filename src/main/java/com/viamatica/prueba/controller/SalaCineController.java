package com.viamatica.prueba.controller;

import com.viamatica.prueba.entity.SalaCine;
import com.viamatica.prueba.service.SalaCineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/sala")
public class SalaCineController {
    @Autowired
    private SalaCineService salaCineService;
    @GetMapping("/{id}")
    public Optional<SalaCine> getById(@PathVariable Integer salaId){
        return salaCineService.buscarPorId(salaId);
    }
    @GetMapping("/{nombre}")
    public String buscarPorNombre(@PathVariable String nombre){
        return salaCineService.buscarPorNombre(nombre);
    }

}
