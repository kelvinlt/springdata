package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;
import com.example.domain.Posicion;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate birthday;
    private Integer numCanastasTotal;
    private Integer numAsistenciasTotal;
    private Integer numRebotesTotal;
    private Posicion posicion;

    public Jugador() {
    }

    public Jugador(String name, LocalDate birthday, Integer numCanastasTotal, Integer numAsistenciasTotal, Integer numRebotesTotal, Posicion posicion) {
        this.name = name;
        this.birthday = birthday;
        this.numCanastasTotal = numCanastasTotal;
        this.numAsistenciasTotal = numAsistenciasTotal;
        this.numRebotesTotal = numRebotesTotal;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getNumCanastasTotal() {
        return numCanastasTotal;
    }

    public void setNumCanastasTotal(Integer numCanastasTotal) {
        this.numCanastasTotal = numCanastasTotal;
    }

    public Integer getNumAsistenciasTotal() {
        return numAsistenciasTotal;
    }

    public void setNumAsistenciasTotal(Integer numAsistenciasTotal) {
        this.numAsistenciasTotal = numAsistenciasTotal;
    }

    public Integer getNumRebotesTotal() {
        return numRebotesTotal;
    }

    public void setNumRebotesTotal(Integer numRebotesTotal) {
        this.numRebotesTotal = numRebotesTotal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", numCanastasTotal=" + numCanastasTotal +
                ", numAsistenciasTotal=" + numAsistenciasTotal +
                ", numRebotesTotal=" + numRebotesTotal +
                ", posicion=" + posicion +
                '}';
    }
}
