package fr.univ_eiffel.entrainement.animals;

public class Shark extends Animal implements Swimmable {

    public Shark(String firstName) {
        super(firstName);
    }
    @Override
    public void swim(double distance) {
        System.out.println(getFirstName() + " swam on " + distance + " kilometers");
    }
}
