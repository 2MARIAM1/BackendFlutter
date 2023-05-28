package com.flutter.flutter_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.Poste;
import service.PosteService;

@RestController
@RequestMapping("/postes")
public class PosteController {
    private final PosteService posteService;

    @Autowired
    public PosteController(PosteService posteService) {
        this.posteService = posteService;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<String> createPoste(
            @PathVariable Long userId,
            @RequestBody Poste posteRequestDto
    ) {
        posteService.createPoste(
                userId,
                posteRequestDto.getDescription(),
                posteRequestDto.getCleaningType(),
                posteRequestDto.getLocation(),
                posteRequestDto.getEstimatedPrice(),
                posteRequestDto.getSurface(),
                posteRequestDto.getServiceDate(),
                posteRequestDto.isBooked()
        );

        return new ResponseEntity<>("Poste créé avec succès.", HttpStatus.CREATED);
    }
}
