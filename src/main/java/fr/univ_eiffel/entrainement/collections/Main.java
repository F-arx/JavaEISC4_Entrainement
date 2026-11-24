package fr.univ_eiffel.entrainement.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        //testArrayList();
        //testHashSet();
        //testHashMap();
        testDoublon();

    }

    public static void testArrayList() {

        ArrayList<String> animaux = new ArrayList<>();

        animaux.add("Human");
        animaux.add("Shark");
        animaux.add("Pigeon");
        animaux.add("Duck");

        System.out.println(animaux);
        System.out.println();

        System.out.println(animaux.get(2));
        System.out.println();

        System.out.println(animaux.size());

        animaux.add("Fish");

        System.out.println();
        System.out.println(animaux.size());
        System.out.println();

        for (String animal : animaux) {
            System.out.println(animal);
        }
    }

    public static void testHashSet() {
        HashSet<String> etudiants = new HashSet<>();

        etudiants.add("Fabio");
        etudiants.add("Alice");
        etudiants.add("Bob");
        etudiants.add("Fabio");
        etudiants.add("Alice");

        System.out.println(etudiants.size());
        System.out.println(etudiants.contains("Bob"));
    }

    public static void testHashMap() {
        HashMap<String, Integer> notes = new HashMap<>();
        notes.put("Fabio",15);
        notes.put("Alice",18);
        notes.put("Bob",12);

        System.out.println(notes.get("Alice"));
        notes.put("Fabio",17);
        System.out.println(notes.get("Fabio"));

        System.out.println(notes.size());

    }

    public static void testDoublon() {
        ArrayList<String> noms = new ArrayList<>();
        noms.add("Fabio");
        noms.add("Alice");
        noms.add("Bob");
        noms.add("Alice");
        noms.add("Fabio");

        HashSet<String> dejaVu = new HashSet<>();

        for (String name : noms) {
            if (!dejaVu.add(name)) {
                System.out.println("Doublon détecté : " + name);
            }
        }

    }


}
