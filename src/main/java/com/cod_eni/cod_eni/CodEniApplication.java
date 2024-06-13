package com.cod_eni.cod_eni;

import com.cod_eni.cod_eni.Service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodEniApplication implements CommandLineRunner {

	@Autowired
	private ICinemaService iCinemaInitService;

	public static void main(String[] args) {
		SpringApplication.run(CodEniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iCinemaInitService.initVille();
		iCinemaInitService.initCinema();
		iCinemaInitService.initSalle();
		iCinemaInitService.initCathegorie();
		iCinemaInitService.initFilm();
		iCinemaInitService.initProjection();
		iCinemaInitService.initPlace();
		iCinemaInitService.initSeance();
		iCinemaInitService.initTicket();
	}
}
