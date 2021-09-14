package com.example.CrudAnimales.Services;

import com.example.CrudAnimales.Entity.Animal;
import com.example.CrudAnimales.Repository.InterfaceRepositoryAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServices implements InterfaceAnimalServices {

    @Autowired
    private InterfaceRepositoryAnimal data;


    @Override
    public List<Animal> List() {
        return (List<Animal>) data.findAll();
    }

    @Override
    public Animal ListById(int id) {
        return data.findById(id).get();
    }

    @Override
    public Animal save(Animal animal) {
        return data.save(animal);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public Animal update(Animal animal, int id) {
       // if (data.findById(id).isEmpty()) {

        //}
        return data.save(animal);
    }
}
