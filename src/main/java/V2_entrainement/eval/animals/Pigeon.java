package V2_entrainement.eval.animals;

public class Pigeon extends Animal implements Flyable {


    public Pigeon(String firstName, String name) {
        super(firstName);
    }

    @Override
    public void fly(double distance) {
        System.out.println("Flew on " + distance + "km");
    }


}
