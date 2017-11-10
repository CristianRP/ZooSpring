package com.umg.zoo.controller;

import com.umg.zoo.model.Location;
import com.umg.zoo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristian Ramírez on 9/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
@Controller
public class LocationController {

    @Autowired
    LocationRepository mRepository;

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public String location(Model model) {
        List<Location> locationList = new ArrayList<>();
        Iterable<Location> locations = mRepository.findAll();
        locations.forEach(locationList::add);
        model.addAttribute("listLocation", locationList);
        return "location";
    }

    /*@GetMapping(value = "/locations")
    public List<Location> getAll() {
        List<Location> locationList = new ArrayList<>();
        Iterable<Location> locations = mRepository.findAll();
        locations.forEach(locationList::add);
        return locationList;
    }*/

    @PostMapping(value = "/location")
    public Location postLocation(@RequestBody Location location) {
        mRepository.save(location);
        return location;
    }




}
