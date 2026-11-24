package fr.univ_eiffel.entrainement.celebrity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        //testAge();
        //testListeCelebrity();
        testTriCelebrity();
    }

    public static void testAge(){
        Celebrity celebrity = new Celebrity("Fabio",2001);
        int age = celebrity.getAge(2026);
        System.out.println(age);
    }

    public static void testListeCelebrity(){
        ArrayList<Celebrity> liste = new ArrayList<>();
        liste.add(new Celebrity("Alice",2000));
        liste.add(new Celebrity("Bob",1995));
        liste.add(new Celebrity("Clara",2003));
        liste.add(new Celebrity("David",1988));

        for(Celebrity c : liste){
            System.out.println(c.getName()+ " "+ c.getBirthYear());
        }
        System.out.println();
        for(Celebrity c : liste){
            System.out.println(c.getName()+ " "+ c.getAge(2026));
        }

        int compteur=0;
        ArrayList<Celebrity> listeYoung = new ArrayList<>();
        for(Celebrity c : liste){
            if(c.getBirthYear()<2000) {
                //listeYoung.add(c);
                compteur++;
            }
        }
        System.out.println(compteur);

    }
    public static void testTriCelebrity(){
        ArrayList<Celebrity> liste = new ArrayList<>();
        liste.add(new Celebrity("Alice",2000));
        liste.add(new Celebrity("Bob",1995));
        liste.add(new Celebrity("Clara",2003));
        liste.add(new Celebrity("David",1988));

        Collections.sort(liste);
        for(Celebrity c : liste){
            System.out.println(c.getName()+" "+c.getBirthYear());
        }
        System.out.println();

        Collections.sort(liste, Comparator.comparing(Celebrity::getName));
        for(Celebrity c : liste){
            System.out.println(c.getName()+" "+c.getBirthYear());
        }


    }
}
