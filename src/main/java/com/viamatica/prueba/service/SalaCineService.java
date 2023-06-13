package com.viamatica.prueba.service;

import com.viamatica.prueba.entity.SalaCine;
import com.viamatica.prueba.repository.SalaCineCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaCineService {
    @Autowired
    private SalaCineCrudRepository salaCineCrudRepository;


    public Optional<SalaCine> buscarPorId(int salaId){
        return salaCineCrudRepository.findById(salaId);
    }
    public String buscarPorNombre(String nombre){

            if(salaCineCrudRepository.buscarPorNombre(nombre).getPeliculaSalaCines().size() > 3){
                return "Sala casi vacia";
            }
            else if (salaCineCrudRepository.buscarPorNombre(nombre).getPeliculaSalaCines().size() >=3 &&
                    salaCineCrudRepository.buscarPorNombre(nombre).getPeliculaSalaCines().size() >=5) {
            return "Sala casi Llena";
        }else
            return "Sala Llena";


    }
}
