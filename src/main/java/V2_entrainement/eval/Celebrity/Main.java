package V2_entrainement.eval.Celebrity;

import V2_entrainement.eval.GasPump;

import java.util.*;


public class Main {
    public static void main(String[] args){
        //testGasPump();

        testCelebrity();
    }

    public static void testGasPump(){
        GasPump pompe = new GasPump(100,2.5);
        System.out.println(pompe.getCapacityMax()+" "+pompe.getPrice());
        try {
            pompe.fill(101);
        }catch (IllegalArgumentException e){
            System.out.println("Erreur1 : " + e.getMessage());
        }catch (IllegalStateException e1){
            System.out.println("Erreur : " + e1.getMessage());
        }
    }

    public static void testCelebrity(){


        Celebrity Alice = new Celebrity("Alice",2000,120);
        Celebrity Bob = new Celebrity("Bob",1995,300);
        Celebrity Fabio = new Celebrity("Fabio",2001,1200);
        Celebrity Caio = new Celebrity("Caio",2000,1);

        Caio.addVisit(3);
        System.out.println(Caio.getVisits());

        Celebrity Clara = new Celebrity("Clara",2003);
        System.out.println(Clara.getVisits());
        Clara.addVisit(5);
        System.out.println(Clara.getVisits());

        ArrayList<Celebrity> liste = new ArrayList<>();
        liste.add(Alice);
        liste.add(Bob);
        liste.add(Fabio);
        liste.add(Caio);
        liste.add(Clara);

        for(Celebrity c : liste){
            System.out.println(c.getName() + " "+c.getAge(2026));
        }
        Celebrity mostFamous = liste.getFirst();
        for (Celebrity c : liste) {
            if (c.getVisits() > mostFamous.getVisits()) {
                mostFamous = c;
            }
        }
        Collections.sort(liste);
        System.out.println(liste);



    }
}
