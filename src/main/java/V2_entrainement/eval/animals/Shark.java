package V2_entrainement.eval.animals;

public class Shark extends Animal implements Swimmable {

    public Shark(String firstName, String name) {
        super(firstName);
    }

    @Override
    public void swim(double distance) {
        System.out.println("Swam on " + distance + "km");
    }

}
