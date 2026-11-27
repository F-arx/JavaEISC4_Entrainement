package fr.univ_eiffel.entrainement.Final;

public class Cat extends Animal{

    public Cat(String name, int hunger) {
        super(name, hunger);
    }

    void eat(Food food){
        if(food.getName().equalsIgnoreCase("Chocolate")){
            throw new IllegalArgumentException("no choclate for cat");
        }
        super.hunger = super.hunger - food.getEnergy();
    }
}
