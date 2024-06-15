package com.cod_eni.cod_eni.Service;

import com.cod_eni.cod_eni.dao.DemandeRepositorie;
import com.cod_eni.cod_eni.dao.ServiceRepositorie;
import com.cod_eni.cod_eni.dao.UtilisateurRepositorie;
import com.cod_eni.cod_eni.entites.Demande;
import com.cod_eni.cod_eni.entites.Service;
import com.cod_eni.cod_eni.entites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.stream.Stream;

@org.springframework.stereotype.Service
public class CitizenServiceImpl implements ICitizenService{
    @Autowired
    private UtilisateurRepositorie utilisateurRepositorie;
    @Autowired
    private DemandeRepositorie demandeRepositorie;
    @Autowired
    private ServiceRepositorie serviceRepositorie;
    @Override
    public void initUtilisateur() {
        Stream.of("RASOA","RABE","HASINA","TOVO").forEach(nomUser->{
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setNom(nomUser);
            utilisateurRepositorie.save(utilisateur);
        });
    }

    @Override
    public void initDemande() {
        utilisateurRepositorie.findAll().forEach(nomUser->{
            Demande demande = new Demande();
            demande.setDateDemande(new Date());
            demande.setUtilisateur(nomUser);
            demandeRepositorie.save(demande);
        });
    }

    @Override
    public void initPayement() {

    }


    @Override
    public void initSetrouve() {

    }

    @Override
    public void initService() {
        Stream.of("COMMUNE","FOKOTANY","FARITANY","REGION","DISTRICT").forEach(nomService->{
            Service service = new Service();
            service.setNom(nomService);
            serviceRepositorie.save(service);
        });
    }

    @Override
    public void initPiece() {

    }

    @Override
    public void initNotification() {

    }

    @Override
    public void initLier() {

    }

    @Override
    public void initFicher() {

    }

    @Override
    public void initBureau() {

    }
}
