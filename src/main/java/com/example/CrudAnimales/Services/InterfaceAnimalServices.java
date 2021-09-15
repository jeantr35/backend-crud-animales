package com.example.CrudAnimales.Services;

import com.example.CrudAnimales.Entity.Animal;
import javassist.NotFoundException;

import java.util.List;

public interface InterfaceAnimalServices {

    public List<Animal> List();
    public Animal ListById(int id) throws NotFoundException;
    public Animal save(Animal animal);
    public void delete(int id);
    public Animal update(Animal animal, int id);
}
