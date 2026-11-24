package fr.univ_eiffel.entrainement.animals;

public class Pigeon extends Animal implements Walkable,Flyable {

    public Pigeon(String firstName) {
        super(firstName);
    }

    @Override
    public void fly(double distance) {
        System.out.println(getFirstName() + " flew on " + distance + " kilometers");    }

    @Override
    public void walk(double distance) {
        System.out.println(getFirstName() + " walked on " + distance + " kilometers");
    }
}
