package fr.univ_eiffel.entrainement.collections;

import java.util.*;

public class Main {
    public static void main(String[] args){

        //testArrayList();
        //testHashSet();
        //testHashMap();
        //testDoublon();
        testNotes();
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

        System.out.println(contientDoublon(noms));
    }

    public static boolean contientDoublon(ArrayList<String> noms) {
        HashSet<String> dejaVu = new HashSet<>();

        for (String name : noms) {
            if (!dejaVu.add(name)) {
                System.out.println("Doublon détecté : " + name);
                return true;
            }
        }
        return false;
    }

    public static void testNotes(){
        HashMap<String,Integer> notes = new HashMap<>();
        notes.put("Julien",18);
        notes.put("Fabio",15);
        notes.put("Sophie",15);
        notes.put("Bob",12);
        notes.put("Alice",15);
        notes.put("Chloé",18);
        System.out.println(notes.get("Alice"));
        notes.replace("Alice",18);
        System.out.println(notes.size());

        System.out.println(notes.get("Alice"));
        System.out.println(notes.containsValue(12));
        notes.remove("Bob");
        System.out.println(notes.size());
        System.out.println(notes.containsKey("Fabio"));
        System.out.println(notes.containsValue(12));
        System.out.println(notes.containsValue(15));


        // Exercice 2
        int compteur = 0;

        for (Map.Entry<String, Integer> h : notes.entrySet()) {
            if (h.getValue() == 18) {
                System.out.println(h.getKey());
                compteur++;
            }
        }

        System.out.println("Nombre d'étudiants ayant 18 : " + compteur);




    }

}
