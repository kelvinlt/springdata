package com.example.repository;

import com.example.domain.Jugador;
import com.example.domain.EstadisticasPosicion;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador , Long>{

    List<Jugador> findByName(String name);

    List<Jugador> findByNumCanastasTotalGreaterThanEqual(Integer numCanastasTotal);

    List<Jugador> findByNumAsistenciasTotalBetween(Integer min,Integer max);

    List<Jugador> findByNameContaining(String letras);

    List<Jugador> findByPosicion(String name);

    List<Jugador> findByBirthdayBefore(LocalDate fecha);

    @Query("select jugador.posicion," +
            "avg(jugador.numCanastasTotal)," +
            "avg(jugador.numAsistenciasTotal)," +
            "avg(jugador.numRebotesTotal)" +
            " from Jugador jugador group by jugador.posicion")
    List<Object[]> AvgCanastasAsistenciasRebotesGroupByPosicion();

    List<Jugador> findByEquipoName(String nombre);

    List<Jugador> findByEquipoNameAndPosicion(String equipo, String posicion);

    Jugador findTopByEquipoNameOrderByNumCanastasTotalDesc(String equipo);

    @Query("select new com.example.domain.EstadisticasPosicion(j.posicion,avg(j.numCanastasTotal), avg(j.numAsistenciasTotal), avg (j.numRebotesTotal))" +
            "from Jugador j group by j.posicion")
    List<EstadisticasPosicion> EstadisticasAvg();

    @Query("select new com.example.domain.EstadisticasPosicion" +
            "(j.posicion," +
            "avg(j.numCanastasTotal),max(j.numCanastasTotal),min(j.numCanastasTotal)," +
            "avg(j.numAsistenciasTotal),max(j.numAsistenciasTotal),min(j.numAsistenciasTotal)," +
            "avg(j.numRebotesTotal),max(j.numRebotesTotal),min(j.numRebotesTotal)" +
            ") from Jugador j group by j.posicion")
    List<EstadisticasPosicion> EstadisticasFull();

}
