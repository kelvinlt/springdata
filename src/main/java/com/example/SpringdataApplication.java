package com.example;

import com.example.service.JugadorService;
import com.example.service.EquipoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdataApplication {

	public static void main(String[] args) {
 		ConfigurableApplicationContext context = SpringApplication.run(SpringdataApplication.class, args);

 		context.getBean(EquipoService.class).testEquipo();
		context.getBean(JugadorService.class).testJugador();


	}
}
