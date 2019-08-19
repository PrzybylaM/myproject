package pl.sdacademy.java16poz.programowanie2.program.service;

import pl.sdacademy.java16poz.programowanie2.program.IAnimal;

import java.util.Map;

public interface IAnimalService {
    int getNumberOfAnimals();

    Map<String, Integer> getAnimalsCount();

    void addAnimal(IAnimal animal);

}

