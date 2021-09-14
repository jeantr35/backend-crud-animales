package com.example.CrudAnimales.Repository;

import com.example.CrudAnimales.Entity.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceRepositoryAnimal extends CrudRepository <Animal, Integer> {

}
