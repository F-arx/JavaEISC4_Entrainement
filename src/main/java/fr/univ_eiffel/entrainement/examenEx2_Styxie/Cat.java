package fr.univ_eiffel.entrainement.examenEx2_Styxie;

import java.util.Objects;

public class Cat extends Animal{
    private boolean indoor;

    public Cat(String name, int hunger, boolean indoor) {
        super(name, hunger);
        this.indoor = indoor;
    }

    public Cat(String name, boolean indoor) {
        super(name);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }
    public void meow(){
        System.out.println("Miaou :3");
    }

    @Override
    public void eat(Food food) {
        if(food == null){
            throw new IllegalArgumentException("food can't be null");
        }
        if (food.getName().equalsIgnoreCase("Chocolate")) {
            throw new IllegalArgumentException("Cat cant eat Chocolate");
        }
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "indoor=" + indoor +
                "} " + super.toString();
    }
}

