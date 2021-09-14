package com.example.CrudAnimales.Controller;

import com.example.CrudAnimales.Services.InterfaceAnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalRestController {

    @Autowired
    private InterfaceAnimalServices service;


}
