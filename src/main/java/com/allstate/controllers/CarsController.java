package com.allstate.controllers;

import com.allstate.models.Car;
import com.allstate.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping({"/cars"})
public class CarsController {

    @Autowired
    CarRepository carRepository;

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Car> index(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page) {
        PageRequest pr = new PageRequest(page, 5);
        return carRepository.findAll(pr);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Car show(@PathVariable int id){
        return carRepository.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Car create(@RequestBody Car car){
        return carRepository.save(car);
    }
}
