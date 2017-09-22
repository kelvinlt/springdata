package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo , Long> {
    List<Equipo> findByName(String name);

}
