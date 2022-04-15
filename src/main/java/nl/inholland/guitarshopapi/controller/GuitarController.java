package nl.inholland.guitarshopapi.controller;


import nl.inholland.guitarshopapi.model.Guitar;
import nl.inholland.guitarshopapi.service.GuitarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.UUID;

@RestController
@RequestMapping(value = "guitars", produces = MediaType.APPLICATION_JSON_VALUE)
public class GuitarController {

    private GuitarService guitarService;

    public GuitarController(GuitarService guitarService) {
        this.guitarService = guitarService;
    }


//  @RequestMapping(method = RequestMethod.GET, value = "")
    @GetMapping
    public ResponseEntity allGuitars() {
        return ResponseEntity.status(200).body(guitarService.getGuitars());
    }

    //@RequestMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createGuitar(@RequestBody Guitar body) {
        try {
           Guitar newGuitar =  guitarService.createGuitar(body);
           return ResponseEntity.status(201).body(newGuitar);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(Collections.singletonMap("message", e.getMessage()));
        }
    }
}
