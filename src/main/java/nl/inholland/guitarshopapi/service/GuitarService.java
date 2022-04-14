package nl.inholland.guitarshopapi.service;

import nl.inholland.guitarshopapi.model.Guitar;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuitarService {

    private List<Guitar> guitars;

    public GuitarService(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public Guitar createGuitar(Guitar guitar) {
        Guitar newGuitar;
        try {
            newGuitar = new Guitar(guitar.getBrand(), guitar.getModel(), guitar.getPrice());
            guitars.add(newGuitar);
        } catch (Exception e) {
            throw new IllegalArgumentException("Something went wrong!");
        }
        return newGuitar;
    }
}
