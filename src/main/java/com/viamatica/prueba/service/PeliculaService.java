package com.viamatica.prueba.service;

import com.viamatica.prueba.entity.Pelicula;
import com.viamatica.prueba.repository.PeliculaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {
    @Autowired
    private PeliculaCrudRepository peliculaCrudRepository;


    public List<Pelicula> getALL(){
        return peliculaCrudRepository.findAll();
    }

    public Optional<Pelicula> getPelicula(int peliculaId){
        return Optional.of(peliculaCrudRepository.getReferenceById(peliculaId));
    }

    public Optional<Pelicula> getByNombre(String nombre){
        return Optional.of(peliculaCrudRepository.findByNombre(nombre));
    }

    public Pelicula save(Pelicula pelicula){
        return peliculaCrudRepository.save(pelicula);
    }

    public String update(int peliculaId, Pelicula pelicula){
        Optional<Pelicula> pelicula1 = peliculaCrudRepository.findById(peliculaId);
        if (pelicula1.isPresent()){
            Pelicula pelicula2 = pelicula1.get();
            pelicula2.setNombre(pelicula.getNombre());
            pelicula2.setDuracion(pelicula.getDuracion());
            pelicula2.setEstado(pelicula.getEstado());

             peliculaCrudRepository.save(pelicula2);
        }
        return "OK";

    }


    public Boolean delete(Integer peliculaId){

        return getPelicula(peliculaId).map(pelicula -> {
            peliculaCrudRepository.deleteById(peliculaId);
            return true;
        }).orElse(false);


    }

}
