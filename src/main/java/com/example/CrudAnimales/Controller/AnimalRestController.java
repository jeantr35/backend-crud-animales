package com.example.CrudAnimales.Controller;

import com.example.CrudAnimales.Entity.Animal;
import com.example.CrudAnimales.Services.AnimalServices;

import com.example.CrudAnimales.Services.InterfaceAnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalRestController {

    @Autowired
    private InterfaceAnimalServices service;

    @GetMapping(value = "/getAnimals")
    public  Iterable<Animal> getAnimals(){
        return  service.List();
    }

    @GetMapping(value = "/getAnimal/{id}")
    public Animal getAnimalById(@PathVariable int id){
        return service.ListById(id);
    }


}
