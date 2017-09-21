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
    private String posicion;

    public Jugador(String name, LocalDate birthday, Integer numCanastasTotal, Integer numAsistenciasTotal, Integer numRebotesTotal, String posicion) {
        this.name = name;
        this.birthday = birthday;
        this.numCanastasTotal = numCanastasTotal;
        this.numAsistenciasTotal = numAsistenciasTotal;
        this.numRebotesTotal = numRebotesTotal;
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (id != null ? !id.equals(jugador.id) : jugador.id != null) return false;
        if (name != null ? !name.equals(jugador.name) : jugador.name != null) return false;
        if (birthday != null ? !birthday.equals(jugador.birthday) : jugador.birthday != null) return false;
        if (numCanastasTotal != null ? !numCanastasTotal.equals(jugador.numCanastasTotal) : jugador.numCanastasTotal != null)
            return false;
        if (numAsistenciasTotal != null ? !numAsistenciasTotal.equals(jugador.numAsistenciasTotal) : jugador.numAsistenciasTotal != null)
            return false;
        if (numRebotesTotal != null ? !numRebotesTotal.equals(jugador.numRebotesTotal) : jugador.numRebotesTotal != null)
            return false;
        return posicion != null ? posicion.equals(jugador.posicion) : jugador.posicion == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (numCanastasTotal != null ? numCanastasTotal.hashCode() : 0);
        result = 31 * result + (numAsistenciasTotal != null ? numAsistenciasTotal.hashCode() : 0);
        result = 31 * result + (numRebotesTotal != null ? numRebotesTotal.hashCode() : 0);
        result = 31 * result + (posicion != null ? posicion.hashCode() : 0);
        return result;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
