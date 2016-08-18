package com.allstate.controllers;

import com.allstate.models.Car;
import com.allstate.models.Client;
import com.allstate.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping({"/clients"})
public class ClientsController {

    @Autowired
    ClientRepository clientRepository;

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Client> index(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page) {
        PageRequest pr = new PageRequest(page, 5);
        return clientRepository.findAll(pr);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Client show(@PathVariable int id){
        return clientRepository.findOne(id);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Client create(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @RequestMapping(path = "/{id}/cars", method = RequestMethod.GET)
    public List<Car> showCars(@PathVariable int id){
        Client client = clientRepository.findOne(id);
        return client.getCars();
    }
}
