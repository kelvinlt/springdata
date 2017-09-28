package com.example.repository;

import com.example.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{
    Equipo findByName(String name);

}
