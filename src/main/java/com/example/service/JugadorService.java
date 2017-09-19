package com.example.service;

import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugador(){
        Jugador jugador1 = new Jugador("kelvin", LocalDate.of(1996,1,27),1,1,1,"aleron");

        jugadorRepository.save(jugador1);
    }

}
