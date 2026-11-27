package V2_entrainement.eval.listes;


import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // ARRAYLIST
        //testArrayListAdd();
        //testArrayListGet();
         //testArrayListSize();
         //testArrayListRemove();
         //testArrayListForEach();

        // HASHSET
         //testHashSetAdd();
         //testHashSetContains();
        //testHashSetDoublons();

        // HASHMAP
         //testHashMapPutGet();
         //testHashMapContainsKey();
         //testHashMapGetOrDefault();
         //testHashMapEntrySet();

        // COMPARABLE
        //testComparable();
         //testCompareTo();
         //testComparableInverse();
    }

    // ========================================
    // PARTIE 1 : ARRAYLIST
    // ========================================

    // EXERCICE 1 : add()
    public static void testArrayListAdd() {

        List<String> celebrities = new ArrayList<>();

        // TODO 1 : Ajouter Alice, Bob et Charlie
        celebrities.add("Bob");
        celebrities.add("Alice");
        celebrities.add("Charlie");

        // TODO 2 : Afficher la liste
        System.out.println(celebrities);
        System.out.println(celebrities.get(1));


    }

    // EXERCICE 2 : get()
    public static void testArrayListGet() {

        List<String> celebrities =
                new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        // TODO : Afficher le deuxième élément
        System.out.println(celebrities);
        System.out.println(celebrities.get(1));
        System.out.println(celebrities.size());

    }

    // EXERCICE 3 : size()
    public static void testArrayListSize() {

        List<String> celebrities =
                new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        // TODO : Afficher le nombre d'éléments
        System.out.println(celebrities.size());


    }

    // EXERCICE 4 : remove()
    public static void testArrayListRemove() {

        List<String> celebrities =
                new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        // TODO 1 : Supprimer Bob
        celebrities.remove("Bob");


        // TODO 2 : Afficher la liste modifiée
        System.out.println(celebrities);

    }

    // EXERCICE 5 : for-each
    public static void testArrayListForEach() {

        List<String> celebrities =
                new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        // TODO : Afficher chaque nom sur une ligne
        for (String c : celebrities){
            System.out.println(c);
        }

    }

    // ========================================
    // PARTIE 2 : HASHSET
    // ========================================

    // EXERCICE 6 : add()
    public static void testHashSetAdd() {

        HashSet<String> noms = new HashSet<>();

        // TODO 1 : Ajouter Alice, Bob, Charlie
        noms.add("Alice");
        noms.add("Bob");
        noms.add("Charlie");
        noms.add("Bob");



        // TODO 2 : Afficher le contenu du HashSet
        System.out.println(noms);

    }

    // EXERCICE 7 : contains()
    public static void testHashSetContains() {

        HashSet<String> noms = new HashSet<>();

        noms.add("Alice");
        noms.add("Bob");
        noms.add("Charlie");

        // TODO : Vérifier si Bob est présent
        System.out.println(noms.contains("Bob"));
    }

    // EXERCICE 8 : Éliminer les doublons
    public static void testHashSetDoublons() {

        List<String> noms = List.of(
                "Alice", "Bob", "Alice",
                "Charlie", "Bob", "Alice"
        );

        // TODO 1 : Créer un HashSet à partir de noms

        HashSet<String> hashNoms = new HashSet<>();

        // TODO 2 : Afficher les noms uniques
        for (String n : noms){
            hashNoms.add(n);
        }

        // TODO 3 : Afficher leur nombre
        System.out.println(hashNoms);
        System.out.println(hashNoms.size());


    }

    // ========================================
    // PARTIE 3 : HASHMAP
    // ========================================

    // EXERCICE 9 : put() et get()
    public static void testHashMapPutGet() {

        HashMap<String, Integer> visites = new HashMap<>();

        // TODO 1 : Ajouter Alice -> 3
        // TODO 2 : Ajouter Bob -> 5
        // TODO 3 : Afficher les visites de Bob

        visites.putAll(Map.of("Alice",3,"Bob",5));
        System.out.println(visites);
        System.out.println(visites.get("Bob"));

    }

    // EXERCICE 10 : containsKey()
    public static void testHashMapContainsKey() {

        HashMap<String, Integer> visites = new HashMap<>();

        visites.put("Alice", 3);
        visites.put("Bob", 5);

        // TODO : Vérifier si Charlie est présent
        System.out.println(visites.containsKey("Charlie"));
        System.out.println(visites.containsKey("Bob"));


    }

    // EXERCICE 11 : getOrDefault()
    public static void testHashMapGetOrDefault() {

        HashMap<String, Integer> visites = new HashMap<>();

        visites.put("Alice", 3);
        visites.put("Bob", 5);



        // TODO 1 : Récupérer les visites de Charlie
        //          en utilisant 0 par défaut

        int charlie = visites.getOrDefault("Charlie",0);
        System.out.println(charlie); // 0



        // TODO 2 : Ajouter une visite à Alice
        visites.put("Alice", visites.getOrDefault("Alice",0)+1);

        // TODO 3 : Afficher la HashMap
        System.out.println(visites); // 0

    }

    // EXERCICE 12 : entrySet()
    public static void testHashMapEntrySet() {

        HashMap<String, Integer> visites = new HashMap<>();

        visites.put("Alice", 3);
        visites.put("Bob", 5);
        visites.put("Charlie", 2);

        // TODO : Parcourir la HashMap avec entrySet()
        // et afficher "Alice : 3 visites", etc.

        for (Map.Entry<String,Integer> v : visites.entrySet()){
            System.out.println(v.getKey()+" : "+v.getValue()+" visites");
        }

    }



    // ========================================
    // PARTIE 4 : COMPARABLE
    // ========================================

    // EXERCICE 13 : Trier des aliments
    public static void testComparable() {

        List<Food> foods = new ArrayList<>();

        foods.add(new Food("Saumon", 120));
        foods.add(new Food("Carotte", 20));
        foods.add(new Food("Poulet", 80));

        // TODO 1 : Afficher les aliments avant le tri
        System.out.println("AVANT LE TRI :");

        for (Food f : foods) {
            System.out.println(f.getName() + " : " + f.getNutrition());
        }

        System.out.println();

        // TODO 2 : Trier la liste avec Collections.sort()
        // Ordre croissant : du moins nutritif au plus nutritif
        Collections.sort(foods);

        // TODO 3 : Afficher les aliments après le tri
        // Utilise une boucle for-each
        System.out.println("APRES LE TRI :");

        for (Food f : foods) {
            System.out.println(f.getName() + " : " + f.getNutrition());
        }
    }


    // EXERCICE 14 : Comparer directement deux aliments
    public static void testCompareTo() {

        Food saumon = new Food("Saumon", 120);
        Food carotte = new Food("Carotte", 20);

        // TODO 1 : Comparer saumon et carotte
        // avec compareTo()
        int resultat = saumon.compareTo(carotte);

        // TODO 2 : Afficher le résultat
        // Négatif : saumon vient avant carotte
        // Zéro : même valeur pour le tri
        // Positif : saumon vient après carotte
        System.out.println("Résultat : " + resultat);

        if (resultat < 0) {
            System.out.println("Saumon vient avant Carotte");
        } else if (resultat > 0) {
            System.out.println("Saumon vient après Carotte");
        } else {
            System.out.println("Les deux aliments sont équivalents pour le tri");
        }
    }


    // EXERCICE 15 : Trier dans l'ordre inverse
    public static void testComparableInverse() {

        List<Food> foods = new ArrayList<>();

        foods.add(new Food("Saumon", 120));
        foods.add(new Food("Carotte", 20));
        foods.add(new Food("Poulet", 80));

        // TODO : Trier du plus nutritif au moins nutritif
        // Indice : Collections.reverseOrder()
        Collections.sort(foods, Collections.reverseOrder());

        // Afficher les aliments triés
        for (Food f : foods) {
            System.out.println(f.getName() + " : " + f.getNutrition());
        }
    }

} // FIN DE LA CLASSE MAIN


// ========================================
// CLASSE FOOD - DANS LE MEME FICHIER
// ========================================

class Food implements Comparable<Food> {

    private String name;
    private int nutrition;

    public Food(String name, int nutrition) {
        this.name = name;
        this.nutrition = nutrition;
    }

    public String getName() {
        return name;
    }

    public int getNutrition() {
        return nutrition;
    }

    @Override
    public int compareTo(Food other) {

        // TODO : Comparer this.nutrition et other.nutrition
        // Utilise Integer.compare()
        return Integer.compare(this.nutrition, other.nutrition);
    }
}

