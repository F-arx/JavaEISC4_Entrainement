package V2_entrainement.eval.animals;

public class Duck extends Animal implements Swimmable, Walkable {

    public Duck(String firstName) {
        super(firstName);
    }

    @Override
    public void swim(double distance) {
        System.out.println("Swam on " + distance + "km");
    }

    @Override
    public void walk(double distance) {
        System.out.println("Walked on " + distance + "km");
    }

}
