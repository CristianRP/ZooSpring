package com.umg.zoo.controller;

import com.umg.zoo.model.Animal;
import com.umg.zoo.model.Location;
import com.umg.zoo.repository.AnimalRepository;
import com.umg.zoo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristian Ramírez on 10/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
@Controller
public class AnimalController {

    @Autowired
    AnimalRepository mRepository;

    @RequestMapping(value = "/animals", method = RequestMethod.GET)
    public String animals(Model model) {
        List<Animal> animalList = new ArrayList<>();
        Iterable<Animal> animals = mRepository.findAll();
        animals.forEach(animalList::add);
        model.addAttribute("listAnimals", animalList);
        return "animal";
    }

    /*@GetMapping(value = "/locations")
    public List<Location> getAll() {
        List<Location> locationList = new ArrayList<>();
        Iterable<Location> locations = mRepository.findAll();
        locations.forEach(locationList::add);
        return locationList;
    }*/

    @RequestMapping(value = "/animal", method = RequestMethod.GET)
    public String animal(Model model) {
        return "new_animal";
    }

    @PostMapping(value = "/animal")
    public Animal postAnimal(@RequestBody Animal animal) {
        mRepository.save(animal);
        return animal;
    }

}
