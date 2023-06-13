package com.viamatica.prueba.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "sala_cine")
@Data
public class SalaCine {
    @Id
    @Column(name = "id_sala")
    private Integer id;

    private String nombre;

    private Boolean estado;

    @OneToMany(mappedBy = "salaCine")
    private List<PeliculaSalaCine> peliculaSalaCines;
}
