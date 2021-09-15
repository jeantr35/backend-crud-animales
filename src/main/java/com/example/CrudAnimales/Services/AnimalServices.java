package com.example.CrudAnimales.Services;
import com.example.CrudAnimales.Entity.Animal;
import com.example.CrudAnimales.Repository.InterfaceRepositoryAnimal;

import com.example.CrudAnimales.configuration.exception.BadRequestException;
import com.example.CrudAnimales.configuration.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServices implements InterfaceAnimalServices {

    @Autowired
    private InterfaceRepositoryAnimal data;


    @Override
    public List<Animal> List() {
        return (List<Animal>) data.findAll();
    }

    @Override
    public Animal ListById(int id) throws NotFoundException {
        Optional<Animal> animal = data.findById(id);
        if(animal.isEmpty()){
            throw new NotFoundException("el animal no existe");
        }
        return animal.get();
    }

    @Override
    public Animal save(Animal animal) {
        if (animal.getName() == null || animal.getName().isEmpty()) {
            throw new BadRequestException("Por favor ingresa el nombre del animal");
        }
        if (animal.getWeight() == null || animal.getWeight().isEmpty()) {
            throw new BadRequestException("Por favor ingresa el peso del animal");
        }
        if (animal.getType() == null || animal.getType().isEmpty()) {
            throw new BadRequestException("Por favor tipo el peso del animal");
        }

        return data.save(animal);
    }

    @Override
    public void delete(int id) {
        Optional<Animal> animal = data.findById(id);
        if(animal.isEmpty()){
            throw new NotFoundException("el animal no existe");
        }
        data.deleteById(id);
    }

    @Override
    public Animal update(Animal animal, int id) {
        Optional<Animal> newAnimal = data.findById(id);
        if(newAnimal.isEmpty()){
            throw new NotFoundException("el animal no existe");
        }
        return data.save(animal);
    }
}
