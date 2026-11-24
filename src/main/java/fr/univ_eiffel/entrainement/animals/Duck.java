package fr.univ_eiffel.entrainement.animals;

public class Duck extends Animal implements Walkable,Swimmable,Flyable {

    public Duck(String firstName) {
        super(firstName);
    }

    @Override
    public void fly(double distance) {
        System.out.println(getFirstName() + " flew on " + distance + " kilometers");
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
