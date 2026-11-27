package fr.univ_eiffel.entrainement.Final;

public class Animal {
    private final String name;
    public int hunger;


    public Animal(String name, int hunger) {
        if(name.isBlank() || hunger <= 0 || hunger > 100)
        {
            throw new IllegalArgumentException("invalid");
        }
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                '}';
    }

    void eat(Food food){
        if(this.hunger - food.getEnergy() < 0){
            this.hunger = 0;
        } else{
            this.hunger = this.hunger - food.getEnergy();
        }
    }
}
