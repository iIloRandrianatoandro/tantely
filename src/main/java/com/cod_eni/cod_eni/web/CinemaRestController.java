package com.cod_eni.cod_eni.web;

import com.cod_eni.cod_eni.dao.FilmRepositorie;
import com.cod_eni.cod_eni.entites.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin("*")
public class CinemaRestController {

    // upload file
    @Autowired
    private FilmRepositorie filmRepositorie;
    @GetMapping(path = "/image/{id}" , produces = MediaType.IMAGE_JPEG_VALUE) // peut etre PDF
    public byte[] image(@PathVariable (name = "id") Long id) throws  Exception{
        Film f = filmRepositorie.findById(id).get();
        String name = f.getPhotos();
        File file = new File(System.getProperty("user.home")+"/imageCinema/"+name);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);
    }

}
