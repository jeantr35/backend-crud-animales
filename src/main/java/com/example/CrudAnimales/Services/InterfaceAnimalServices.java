package com.example.CrudAnimales.Services;

import com.example.CrudAnimales.Entity.Animal;

import java.util.List;

public interface InterfaceAnimalServices {

    public List<Animal> List();
    public Animal ListById(int id);
    public Animal save(Animal animal);
    public void delete(int id);
    public Animal update(Animal animal, int id);
}
