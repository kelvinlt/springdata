package com.example.service;

import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){
        Equipo stucom = new Equipo("Stucom","Spain", LocalDate.of(2010,1,20));
        equipoRepository.save(stucom);

        Equipo skt = new Equipo("SKT","Korea",LocalDate.of(2011,2,23));
        equipoRepository.save(skt);

        Equipo tsm = new Equipo("TSM","America",LocalDate.of(2007,6,25));
        equipoRepository.save(tsm);

        Equipo moscow5 = new Equipo("Moscow 5","Rusia",LocalDate.of(2006,5,12));
        equipoRepository.save(moscow5);

        Equipo fnatic = new Equipo("Fnatic","Germany",LocalDate.of(2006,5,21));
        equipoRepository.save(fnatic);





    }

}
