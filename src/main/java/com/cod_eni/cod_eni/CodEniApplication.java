package com.cod_eni.cod_eni;

import com.cod_eni.cod_eni.Service.ICitizenService;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@SpringBootApplication
public class CodEniApplication implements CommandLineRunner {

    @Autowired
    private ICitizenService iCitizenService;
	public static void main(String[] args) {
		SpringApplication.run(CodEniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        iCitizenService.initUtilisateur();
        iCitizenService.initService();
        iCitizenService.initDemande();
	}

}

