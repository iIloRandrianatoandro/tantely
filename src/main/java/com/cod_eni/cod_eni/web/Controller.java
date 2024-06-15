package com.cod_eni.cod_eni.web;

import com.cod_eni.cod_eni.dao.UtilisateurRepositorie;
import com.cod_eni.cod_eni.entites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UtilisateurRepositorie utilisateurRepositorie;

    @GetMapping("/utilisateur")
    public List<Utilisateur> utilisateurs(){
        return utilisateurRepositorie.findAll();
    }


}
