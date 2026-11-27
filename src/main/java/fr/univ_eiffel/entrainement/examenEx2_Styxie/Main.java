package fr.univ_eiffel.entrainement.examenEx2_Styxie;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Food> food = new ArrayList<>();
        food.add(new Food("Grass", 1, 1));
        food.add( new Food("Hay", 5, 0.2));
        food.add( new Food("Tree", 5, 0.5));
        food.add( new Food("RedBull", 180, 1.99));
        food.add( new Food("Monster", 180, 1.99));

        System.out.println("------------- List -------------");
        for(int i = 0; i<5; i++)
        {
            System.out.println(food.get(i).toString());
        }
        Collections.sort(food);
        System.out.println("------------- Sorted List -------------");
        for(int i = 0; i<5; i++)
        {
            System.out.println(food.get(i).toString());
        }

        Food fish = new Food("Fish", 30, 2);


        System.out.println("-------------Animals-------------");

        Animal cat = new Animal("cat",10);
        Animal dog = new Animal("dog",20);
        Animal Rex = new Animal("Rex");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(Rex);


        System.out.println("-------------Animals Eat-------------");

        cat.eat(fish);
        dog.eat(food.get(1));

        System.out.println(cat);
        System.out.println(dog);


        System.out.println("--------------Cat---------------");

        Cat coco = new Cat("coco",70,true);
        System.out.println(coco);
        coco.meow();
        coco.eat(new Food("Fish",20,4));
        System.out.println(coco);
        coco.eat(new Food("Chocolate", 40, 3));
        System.out.println(coco);


    }
}
