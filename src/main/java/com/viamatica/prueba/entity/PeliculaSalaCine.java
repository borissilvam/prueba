package com.viamatica.prueba.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "pelicula_salacine")
@Data
public class PeliculaSalaCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula_sala")
    private Integer id;
    @Column(name = "id_sala_cine")
    private Integer idSala;
    @Column(name = "id_pelicula")
    private Integer idPelicula;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;
    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_sala", insertable = false, updatable = false)
    private SalaCine salaCine;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula pelicula;

}
