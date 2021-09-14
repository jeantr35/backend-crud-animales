package com.example.CrudAnimales.Controller;

import com.example.CrudAnimales.Entity.Animal;
import com.example.CrudAnimales.Services.AnimalServices;

import com.example.CrudAnimales.Services.InterfaceAnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/saveAnimal")
    public Animal saveAnimal(@RequestBody Animal animal){
        return service.save(animal);
    }

    @DeleteMapping(value = "deleteAnimal/{id}")
    public void deleteAnimal(@PathVariable int id){
        service.delete(id);
    }

    @PutMapping(value = "/updateAnimal/{id}")
    public Animal updateAnimal(@RequestBody Animal animal, @PathVariable int id){
        return service.update(animal,id);
    }


}
