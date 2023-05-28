package com.flutter.flutter_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.Poste;
import model.Poste;
import service.PosteService;
import service.PosteService;

@RestController
@RequestMapping("/postes")
public class PosteController {
    private final PosteService posteService;

    @Autowired
    public PosteController(PosteService posteService) {
        this.posteService = posteService;
    }

   
    @GetMapping("/all")
    public ResponseEntity<List<Poste>> getAllPostes () {
        List<Poste> postes = posteService.getAllPostes();
        return new ResponseEntity<>(postes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Poste> getPosteById (@PathVariable("id") Long id) throws Throwable {
        Poste poste = posteService.getPosteById(id);
        return new ResponseEntity<>(poste, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Poste> addPoste(@RequestBody Poste poste) {
        Poste newPoste = posteService.createPoste(poste);
        return new ResponseEntity<>(newPoste, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Poste> updatePoste(@RequestBody Poste poste) throws Throwable {
        Poste updatePoste = posteService.updatePoste(poste);
        return new ResponseEntity<>(updatePoste, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePoste(@PathVariable("id") Long id) {
        posteService.deletePoste(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
