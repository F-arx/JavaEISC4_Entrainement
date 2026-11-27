package V2_entrainement.eval.animals;

import fr.univ_eiffel.entrainement.animals.Swimmable;

public class Human extends Animal implements Walkable,Swimmable {
    public Human(String firstName) {
        super(firstName);
    }

    @Override
    public void walk(double distance) {
        System.out.println(getFirstName() + " walk on " + distance + " kilometers");

    }

    @Override
    public void swim(double distance) {
        System.out.println(getFirstName() + " swim on "+ distance + "kilometers");
    }

}
