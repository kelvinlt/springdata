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
        Jugador kelvin = new Jugador("kelvin", LocalDate.of(1996,1,27),1,6,5,"aleron");

        jugadorRepository.save(kelvin);

        Jugador saiden = new Jugador("saiden",LocalDate.of(1996,12,24),2,2,3,"base");

        jugadorRepository.save(saiden);

        Jugador sergi = new Jugador("sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");

        jugadorRepository.save(sergi);

    }

}
