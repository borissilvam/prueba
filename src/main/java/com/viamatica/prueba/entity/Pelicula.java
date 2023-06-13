package com.viamatica.prueba.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "pelicula")
@Data
public class Pelicula {
    @Id
    @Column(name = "id_pelicula")
    private Integer id;

    private String nombre;

    private Integer duracion;

    private Boolean estado;



}
