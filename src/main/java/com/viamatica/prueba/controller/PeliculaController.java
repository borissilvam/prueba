package com.viamatica.prueba.controller;

import com.viamatica.prueba.entity.Pelicula;
import com.viamatica.prueba.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;
        @GetMapping("/all")
        public List<Pelicula> getAll() {
            return peliculaService.getALL();
        }
        @GetMapping("/{nombre}")
        public Optional<Pelicula> getByNombre(@PathVariable String nombre) {
            return peliculaService.getByNombre(nombre);
        }

        @PostMapping("/save")
        public Pelicula save(@RequestBody Pelicula pelicula){
            return peliculaService.save(pelicula);
        }


        @PutMapping("/update/{id}")
        public String update(@PathVariable("id") int peliculaId, @RequestBody Pelicula pelicula){
            return peliculaService.update(peliculaId, pelicula);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity delete(@PathVariable("id") Integer peliculaId){

             if (peliculaService.delete(peliculaId)){
                 return new ResponseEntity(HttpStatus.OK);
             }else {
                 return new ResponseEntity(HttpStatus.NOT_FOUND);
             }


        }

}
