
package V2_entrainement.eval.dernier_tp;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        test1HashMap();
        test2Occurrences();
        test3Maximum();
        test4CollectionsSort();
        test5Comparator();
        test6Comparable();
    }

    // 1. HASHMAP : put(), get(), containsKey()
    public static void test1HashMap() {

        Map<String, Integer> visites = new HashMap<>();

        // TODO 1 : Alice a 3 visites, Bob en a 5
        visites.put("Alice",3);
        visites.put("Bob",5);
        // TODO 2 : Afficher le nombre de visites de Bob
        System.out.println("Bob : "+visites.get("Bob")+"vistes");
        // TODO 3 : Vérifier si Charlie est présent
        System.out.println(visites.containsKey("Charlie"));
    }

    // 2. HASHMAP : getOrDefault()
    public static void test2Occurrences() {

        List<String> noms = List.of(
                "Alice", "Bob", "Alice", "Alice", "Bob"
        );

        Map<String, Integer> compteur = new HashMap<>();

        // TODO : Compter les apparitions de chaque nom
        // Résultat : Alice=3, Bob=2
        for(String n : noms){
            compteur.put(n, compteur.getOrDefault(noms,0) + 1);
        }
    }

    // 3. HASHMAP : entrySet() et recherche du maximum
    public static void test3Maximum() {

        Map<String, Integer> visites = new HashMap<>();

        visites.put("Alice", 3);
        visites.put("Bob", 7);
        visites.put("Charlie", 2);

        String gagnant = "";
        int maximum = 0;

        for (Map.Entry<String ,Integer> v : visites.entrySet()){
            if(maximum<v.getValue()){
                maximum = Math.max(maximum,v.getValue());
                gagnant = v.getKey();
            }

        }
        System.out.println("Gagnant : "+gagnant+" avec "+visites.get(gagnant)+" vistes");

        // TODO : Parcourir la Map avec entrySet()
        // TODO : Trouver la personne avec le plus de visites
        // TODO : Afficher Bob : 7
    }

    // 4. COLLECTIONS.SORT()
    public static void test4CollectionsSort() {

        List<Integer> nombres = new ArrayList<>(
                List.of(40, 10, 30, 20)
        );

        // TODO 1 : Trier en ordre croissant
        Collections.sort(nombres);

        // TODO 2 : Afficher les nombres
        System.out.println(nombres);
        // TODO 3 : Trier en ordre décroissant
        Collections.sort(nombres,Collections.reverseOrder());
        // TODO 4 : Afficher les nombres
        System.out.println(nombres);
    }

    // 5. COMPARATOR : comparer selon un critère
    public static void test5Comparator() {

        List<String> animaux = new ArrayList<>(
                List.of("Elephant", "Chat", "Hippopotame")
        );

        String Larger="";
        // TODO 1 : Trier par longueur croissante
            animaux.sort(Comparator.comparingInt(String::length));

        // TODO 2 : Afficher les animaux
        System.out.println(animaux);

        // TODO 3 : Trier par longueur décroissante

        animaux.sort(Comparator.reverseOrder());
        System.out.println(animaux);
    }

    // 6. COMPARABLE : trier des objets Food
    public static void test6Comparable() {

        List<Food> foods = new ArrayList<>();

        foods.add(new Food("Saumon", 120));
        foods.add(new Food("Carotte", 20));
        foods.add(new Food("Poulet", 80));

        // TODO 1 : Trier les Food par nutrition croissante
        // TODO 2 : Afficher leur nom et leur nutrition
    }

    static class Food implements Comparable<Food> {

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

            // TODO : Comparer this.nutrition
            // et other.nutrition avec Integer.compare()

            return 0; // À remplacer
        }
    }
}
