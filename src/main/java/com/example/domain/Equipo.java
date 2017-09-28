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

    public Equipo(String name, String localidad, LocalDate creacion) {
        this.name = name;
        this.localidad = localidad;
        this.creacion = creacion;
    }

    public Equipo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipo equipo = (Equipo) o;

        if (Id != null ? !Id.equals(equipo.Id) : equipo.Id != null) return false;
        if (name != null ? !name.equals(equipo.name) : equipo.name != null) return false;
        if (localidad != null ? !localidad.equals(equipo.localidad) : equipo.localidad != null) return false;
        return creacion != null ? creacion.equals(equipo.creacion) : equipo.creacion == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (creacion != null ? creacion.hashCode() : 0);
        return result;
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
