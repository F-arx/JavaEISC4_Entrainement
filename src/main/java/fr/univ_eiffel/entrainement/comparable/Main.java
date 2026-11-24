package fr.univ_eiffel.entrainement.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        //Colis colis = new Colis("Fabio",5);
        //System.out.println(colis.getNom()+" "+colis.getPoids());
        //Colis colis1 = new Colis("A", 3);
        //Colis colis2 = new Colis("B", 4);
        //System.out.println(colis1.compareTo(colis2));

        //testCollections();
        testComparator();
    }

    public static void testCollections(){
        ArrayList<Colis> liste = new ArrayList<>();
        liste.add(new Colis("A",8));
        liste.add(new Colis("B",3));
        liste.add(new Colis("C",12));
        liste.add(new Colis("D",5));
        Collections.sort(liste);

        for (Colis c : liste) {
            System.out.println(c.getNom() + " " + c.getPoids());
        }

    }

    public static void testComparator(){
        ArrayList<Colis> liste = new ArrayList<>();
        liste.add(new Colis("D",5));
        liste.add(new Colis("B",3));
        liste.add(new Colis("A",8));
        liste.add(new Colis("C",12));

        for (Colis c : liste) {
            System.out.println(c.getNom() + " " + c.getPoids());
        }
        Collections.sort(liste,Comparator.comparing(Colis::getNom));

        for (Colis c : liste) {
            System.out.println(c.getNom() + " " + c.getPoids());
        }


    }
}
