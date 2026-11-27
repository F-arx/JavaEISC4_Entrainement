package V2_entrainement.eval.animals;

public class Main {
    public static void main(String[] args){

        testClass();

    }
    public static void testClass(){
        Animal animal = new Animal("Doggy");
        System.out.println(animal.getFirstName());
        Human human = new Human("Fabio");
        System.out.println(human.getFirstName());
        Human Fabio = new Human("Fabio");
        System.out.println(human.getFirstName());



    }
}
