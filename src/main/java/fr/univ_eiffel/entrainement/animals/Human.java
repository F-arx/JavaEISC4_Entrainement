package fr.univ_eiffel.entrainement.animals;

public class Human extends Animal implements Walkable,Swimmable {

    public Human(String firstName) {
        super(firstName);
    }

    @Override
    public void swim(double distance) {
        System.out.println(getFirstName() + " swam on " + distance + " kilometers");
    }

    @Override
    public void walk(double distance) {
        System.out.println(getFirstName() + " walked on " + distance + " kilometers");
    }
}
