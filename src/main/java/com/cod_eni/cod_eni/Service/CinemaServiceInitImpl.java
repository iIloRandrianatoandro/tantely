package com.cod_eni.cod_eni.Service;

import com.cod_eni.cod_eni.dao.*;
import com.cod_eni.cod_eni.entites.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Service
@Transactional // toutes les methode sont transactionnels
public class CinemaServiceInitImpl implements ICinemaService{

    @Autowired
    private VilleRepositorie villeRepositorie;
    @Autowired
    private CinemaRepositorie cinemaRepositorie;
    @Autowired
    private SalleRepositorie salleRepositorie;
    @Autowired
    private FilmRepositorie filmRepositorie;
    @Autowired
    private CathegorieRepositorie cathegorieRepositorie;
    @Autowired
    private PlaceRepositorie placeRepositorie;
    @Override
    public void initVille() {
        Stream.of("Antananarivo","Fianarantsoa","Toamasina","Diego").forEach(nameVille->{
            Ville ville = new Ville();
            ville.setNomville(nameVille);
            villeRepositorie.save(ville);
        });
    }

    @Override
    public void initCinema() {
        villeRepositorie.findAll().forEach(ville -> {
            Stream.of("SCOOP DIGITAL","HORIZON","MANA PROD","NOVEGASY").forEach(nameCinema->{
                Cinema cinema = new Cinema();
                cinema.setName(nameCinema);
                cinema.setNombreSalle((int) (3+Math.random()*7));
                cinema.setVille(ville);
                cinemaRepositorie.save(cinema);
            });
        });
    }

    @Override
    public void initSalle() {
        cinemaRepositorie.findAll().forEach(cinema -> {
            for (int i=0 ; i<cinema.getNombreSalle() ; i++){
                Salle salle = new Salle();
                salle.setNomSalle("Salle "+(i+1));
                salle.setCinema(cinema);
                salle.setNombrePlace((int) (15+Math.random()*20));
                salleRepositorie.save(salle);
            }
        });
    }

    @Override
    public  void initPlace(){
        salleRepositorie.findAll().forEach(salle -> {
            //for (int i = 0 ; i<salle.get)
            for(int i=0; i<salle.getNombrePlace(); i++){
                Place place = new Place();
                place.setNumPlace(i+1);
                place.setSalle(salle);
                placeRepositorie.save(place);
            }
        });
    }

    @Override
    public void initSeance(){

    }
    @Override
    public void initCathegorie() {
        Stream.of("Histoire","action","romantique","commedie").forEach(cat->{
            Cathegorie cathegorie = new Cathegorie();
            cathegorie.setName(cat);
            cathegorieRepositorie.save(cathegorie);
        });
    }

    @Override
    public void initFilm() {
        double[] duree = new double[] {1,1.5,2,3,2.5} ;
        List<Cathegorie> cathegories = cathegorieRepositorie.findAll();
        Stream.of("MALOK'ILA","ANAY","SEDRA","ILO AINA","ANDREBABE").forEach(f->{
            Film film = new Film();
            film.setTitre(f);
            film.setDuree(duree[new Random().nextInt(duree.length)]);
            film.setPhotos(f.replaceAll(" ","")+".jpg");
            film.setCathegorie(cathegories.get(new Random().nextInt(cathegories.size())));
            filmRepositorie.save(film);
        });
    }

    @Override
    public  void initProjection(){

    }

    @Override
    public  void initTicket(){

    }

}
