package nl.inholland.guitarshopapi.controller;

import nl.inholland.guitarshopapi.service.GuitarService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "other", produces = MediaType.APPLICATION_JSON_VALUE)
public class OtherController {

    private GuitarService otherService;

    public OtherController(GuitarService otherService) {
        this.otherService = otherService;
    }

    @GetMapping
    public ResponseEntity otherGuitars() {
        return  ResponseEntity.ok().body(otherService.getGuitars());
    }
}
