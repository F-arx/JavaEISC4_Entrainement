package fr.univ_eiffel.entrainement.examenEx2_Styxie;

public class Animal {
    private final String name;
    private int hunger;

    public Animal(String name, int hunger) {
        if(name == null)
        {
            throw new IllegalArgumentException("name null");
        }
        if(name.isBlank()){
            throw new IllegalArgumentException("name empty or null, energy negative or null, price negative");
        }
        if(hunger > 100 || hunger < 0){
            throw new IllegalArgumentException("Hunger cant be negative");
        }

        this.name = name;
        this.hunger = hunger;
    }
    public Animal(String name) {
        if(name == null)
        {
            throw new IllegalArgumentException("name null");
        }
        if(name.isBlank()){
            throw new IllegalArgumentException("name empty or null, energy negative or null, price negative");
        }
        this.name = name;
        this.hunger = 50;
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

    public void eat(Food food){
        if(food == null){
            throw new IllegalArgumentException("food can't be null");
        }
        if(this.hunger - food.getEnergy() < 0)
        {
            this.hunger = 0;
        } else{
        this.hunger -= food.getEnergy();
        }
    }

}
