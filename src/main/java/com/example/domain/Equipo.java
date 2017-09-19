package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String localidad;
    private LocalDate creacion;

    public Equipo() {
    }

    public Equipo(String name, String localidad, LocalDate creacion) {
        this.name = name;
        this.localidad = localidad;
        this.creacion = creacion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", localidad='" + localidad + '\'' +
                ", creacion=" + creacion +
                '}';
    }
}
