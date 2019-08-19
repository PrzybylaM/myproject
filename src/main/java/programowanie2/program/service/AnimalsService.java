package pl.sdacademy.java16poz.programowanie2.program.service;

import pl.sdacademy.java16poz.programowanie2.program.IAnimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnimalsService implements IAnimalService {

    private final ArrayList<IAnimal> animals = new ArrayList<IAnimal>();

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> map = new HashMap<>();

        for (IAnimal animal : animals) {
            String name = animal.getClass().getSimpleName();
            int val = 1;
            if(map.containsKey(name)){
                val = map.get(name) + 1;
            }
            map.put(name, val);
        }

        return map;
    }



    public void addAnimal(IAnimal animal) {
        animals.add(animal);

    }



}
