package programowanie2.program.service;

import programowanie2.program.IAnimal;

import java.util.Map;

public interface IAnimalService {
    int getNumberOfAnimals();

    Map<String, Integer> getAnimalsCount();

    void addAnimal(IAnimal animal);

}

