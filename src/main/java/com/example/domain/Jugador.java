package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;
import com.example.domain.Posicion;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDate birthday;
    private Integer numCanastasTotal;
    private Integer numAsistenciasTotal;
    private Integer numRebotesTotal;
    private Posicion posicion;



}
