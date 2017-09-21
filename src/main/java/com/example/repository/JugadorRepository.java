package com.example.repository;

import com.example.domain.Jugador;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador , Long>{

    List<Jugador> findByName(String name);

    List<Jugador> findByNumCanastasTotalGreaterThanEqual(Integer numCanastasTotal);

    List<Jugador> findByNumCanastasTotalBetween(Integer min,Integer max);


}
