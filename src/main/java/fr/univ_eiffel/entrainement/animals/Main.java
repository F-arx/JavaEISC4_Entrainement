package fr.univ_eiffel.entrainement.animals;

public class Main {
    public static void main(String[] args){
    //testAnimalsImplements();
    testPolymorphisme();
    }

    public static void testAnimalsImplements(){
        Human human = new Human("Fabio");
        Shark shark =new Shark("babyShark");
        shark.swim(60);
        human.walk(10);
        human.swim(1);

        Pigeon pigeon = new Pigeon("Comby");
        pigeon.fly(20);
        pigeon.walk(0.5);

        Duck duck = new Duck("Donald");
        duck.fly(2);
        duck.walk(2);
        duck.swim(4);
    }

    public static void testPolymorphisme() {

        Swimmable nageur = new Shark("Bob");

        nageur.swim(10);

        Swimmable[] nageurs = {
                new Shark("Bob"),
                new Human("Fabio"),
                new Duck("Donald")
        };
        double somme = 0;

        for (Swimmable s : nageurs) {
            s.swim(10);
            somme += 10;
        }
        System.out.println("Distance totale : " + somme);
    }



}
