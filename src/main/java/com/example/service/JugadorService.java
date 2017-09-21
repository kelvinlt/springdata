package com.example.service;

import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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

        Jugador aleix = new Jugador("aleix", LocalDate.of(1995,7,4),1,1,1,"aleron");
        jugadorRepository.save(aleix);

        Jugador zerus = new Jugador("zerus", LocalDate.of(1994,4,14),4,3,4,"base");
        jugadorRepository.save(zerus);



        System.out.println("=====================================================================================================================================================");
        //prueba
        System.out.println("Buscar jugador con kelvin");
        System.out.println(jugadorRepository.findByName("kelvin"));
        System.out.println("=====================================================================================================================================================");
        //a
        System.out.println("Buscar por a");
        System.out.println(jugadorRepository.findByNameContaining("a"));
        System.out.println("=====================================================================================================================================================");
        //b
        System.out.println("Buscar por canastas igual o mayor que 2");
        System.out.println(jugadorRepository.findByNumCanastasTotalGreaterThanEqual(2));
        System.out.println("=====================================================================================================================================================");
        //c
        System.out.println("Buscar por asistencias entre 3 y 6");
        System.out.println(jugadorRepository.findByNumAsistenciasTotalBetween(3,6));
        System.out.println("=====================================================================================================================================================");
        //d
        System.out.println("Buscar por posicion base");
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println("=====================================================================================================================================================");
        //e
        System.out.println("Buscar por fecha de nacimiento anterior a ");
        System.out.println(jugadorRepository.findByBirthdayBefore(LocalDate.of(1996,7,25)));
        System.out.println("=====================================================================================================================================================");
        //f
        List<Object[]> jugadorList = jugadorRepository.AvgCanastasAsistenciasRebotesGroupByPosicion();

        for (Object[] jugador : jugadorList){
            System.out.println("=====================================================================================================================================================");
            String pos = (String) jugador[0];
            System.out.println("Posición: "+jugador[0]);
            System.out.println("Canastas: "+jugador[1]);
            System.out.println("Asistencias: "+jugador[2]);
            System.out.println("Rebotes: "+jugador[3]);
            System.out.println("=====================================================================================================================================================");
        }


        System.out.println("=====================================================================================================================================================");

    }

}
