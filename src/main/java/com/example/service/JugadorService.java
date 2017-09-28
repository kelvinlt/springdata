package com.example.service;

import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
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

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador(){
        Jugador kelvin = new Jugador("kelvin", LocalDate.of(1996,1,27),1,6,5,"aleron");
        kelvin.setEquipo(equipoRepository.findByName("stucom"));
        jugadorRepository.save(kelvin);


        Jugador saiden = new Jugador("saiden",LocalDate.of(1996,12,24),2,2,3,"base");
        saiden.setEquipo(equipoRepository.findByName("stucom"));
        jugadorRepository.save(saiden);

        Jugador sergi = new Jugador("sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");
        sergi.setEquipo(equipoRepository.findByName("stucom"));
        jugadorRepository.save(sergi);

        Jugador aleix = new Jugador("aleix", LocalDate.of(1995,7,4),1,1,1,"aleron");
        aleix.setEquipo(equipoRepository.findByName("stucom"));
        jugadorRepository.save(aleix);

        Jugador zerus = new Jugador("zerus", LocalDate.of(1994,4,14),4,3,4,"base");
        zerus.setEquipo(equipoRepository.findByName("stucom"));
        jugadorRepository.save(zerus);


        Jugador shya = new Jugador("Shya",LocalDate.of(1989, 1, 2),4,2,8,"base");
        shya.setEquipo(equipoRepository.findByName("tsm"));
        jugadorRepository.save(shya);

        Jugador miquel = new Jugador("Miquel",LocalDate.of(1972, 10, 2),4,1999,88,"base");
        miquel.setEquipo(equipoRepository.findByName("tsm"));
        jugadorRepository.save(miquel);

        Jugador jose = new Jugador("Jose",LocalDate.of(1974, 10, 5),9,19,8,"base");
        jose.setEquipo(equipoRepository.findByName("tsm"));
        jugadorRepository.save(jose);

        Jugador inquisidor = new Jugador("Inquisidor",LocalDate.of(1425, 1, 29),568,1587,1547,"base");
        inquisidor.setEquipo(equipoRepository.findByName("tsm"));
        jugadorRepository.save(inquisidor);

        Jugador adeu = new Jugador("Adeu",LocalDate.of(1984, 8, 29),15,25,17,"alero");
        adeu.setEquipo(equipoRepository.findByName("tsm"));
        jugadorRepository.save(adeu);

        Jugador hans = new Jugador("Hans",LocalDate.of(1986, 10, 8),7,17,45,"alero");
        hans.setEquipo(equipoRepository.findByName("moscow 5"));
        jugadorRepository.save(hans);

        Jugador balon = new Jugador("Balon",LocalDate.of(1964, 1, 21),4,8,9,"pivot");
        balon.setEquipo(equipoRepository.findByName("moscow 5"));
        jugadorRepository.save(balon);

        Jugador javi = new Jugador("Javi",LocalDate.of(1991, 4, 24),8,9,17,"pivot");
        javi.setEquipo(equipoRepository.findByName("moscow 5"));
        jugadorRepository.save(javi);

        Jugador equestre = new Jugador("Equestre",LocalDate.of(1984, 7, 17),5,2,7,"alero");
        equestre.setEquipo(equipoRepository.findByName("moscow 5"));
        jugadorRepository.save(equestre);

        Jugador pote = new Jugador("Pote",LocalDate.of(1982, 3, 4),6,8,2,"alero");
        pote.setEquipo(equipoRepository.findByName("moscow 5"));
        jugadorRepository.save(pote);



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
