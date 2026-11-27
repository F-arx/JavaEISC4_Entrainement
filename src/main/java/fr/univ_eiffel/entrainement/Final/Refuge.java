package fr.univ_eiffel.entrainement.Final;

import java.util.ArrayList;
import java.util.Comparator;

public class Refuge {
    private final ArrayList<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public Animal mostHungry(){
        Animal MostHungry;
        MostHungry = animals.getFirst();
        for(Animal animal : animals){
            if(animals.get(animal.getHunger()).getHunger() > MostHungry.getHunger()) {
                MostHungry = animal;
            }
        }
        return MostHungry;
    }

}
