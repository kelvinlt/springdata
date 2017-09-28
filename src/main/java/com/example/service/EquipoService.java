package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testEquipo() {
        Equipo stucom = new Equipo("Stucom", "barcelona", LocalDate.of(1996, 12, 1));
        equipoRepository.save(stucom);
        jugadorRepository.findByName("kelvin");

        Equipo moscow5 = new Equipo("Moscow 5", "moscow", LocalDate.of(2001, 2, 16));
        equipoRepository.save(stucom);

        Equipo skt = new Equipo("Sk Telecom", "korea", LocalDate.of(2004, 8, 21));
        equipoRepository.save(skt);

        Equipo tsm = new Equipo("TSM", "america", LocalDate.of(2001, 7, 7));
        equipoRepository.save(tsm);

        Equipo fnatic = new Equipo("Fnatic", "germany", LocalDate.of(2000, 4, 14));
        equipoRepository.save(fnatic);

        System.out.println(equipoRepository.findByName("stucom"));
    }
}
