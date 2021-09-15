package com.example.CrudAnimales.Controller;

import com.example.CrudAnimales.Entity.Animal;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.CrudAnimales.Services.InterfaceAnimalServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/animal")
@CrossOrigin(origins="http://localhost:3000/")
public class AnimalRestController {

    @Autowired
    private InterfaceAnimalServices service;

    @GetMapping(value = "/getAnimals")
    public  Iterable<Animal> getAnimals(){
        return  service.List();
    }


    // listar por ID
    @GetMapping(value = "/getAnimal/{id}")
    public ResponseEntity<Animal> listById(@PathVariable int id) throws NotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(service.ListById(id));
    }

    @PostMapping(value = "/saveAnimal")
    public Animal saveAnimal(@RequestBody Animal animal){
        return service.save(animal);
    }


    @DeleteMapping(value = "deleteAnimal/{id}")
    public ResponseEntity deleteAnimal(@PathVariable int id){
        service.delete(id);
        return new ResponseEntity("ok",HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/updateAnimal/{id}")
    public Animal updateAnimal(@RequestBody Animal animal, @PathVariable int id){
        return service.update(animal,id);
    }


}
