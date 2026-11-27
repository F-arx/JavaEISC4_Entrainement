package revision.eval.finale.listes;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {

        //test01Scanner();

        //System.out.println("===== Révision Java : exercices 02 à 10 =====");
        //test02Statistiques();
       // test03ArrayList();
        //test04ForEach();
        //test05HashSet();
        //test06HashMap();
        //test07Occurrences();
        //test08Tri();
        //test09Fichier();
        //test10MiniDS();
        //System.out.println("===== Fin des exercices 02 à 10 =====");
    }

    // ========================================
    // 01 - SCANNER
    // ========================================

    public static void test01Scanner() {


        Scanner scanner = new Scanner(System.in);

        // TODO 1 : Demander combien de nombres saisir.
        System.out.print("Combien de nombres ? ");

        // TODO 2 : Lire ce nombre avec nextInt().
        if (!scanner.hasNextInt()) {
            System.out.println("Saisie invalide.");
            return;
        }
        int n = scanner.nextInt();

        // TODO 3 : Refuser une quantité <= 0.
        if (n <= 0) {
            System.out.println("Quantité invalide.");
            return;
        }

        int somme = 0;

        // TODO 4 : Lire les nombres dans une boucle.
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");

            // TODO 5 : Utiliser hasNextInt() pour vérifier
            //          chaque saisie avant nextInt().
            if (!scanner.hasNextInt()) {
                System.out.println("Ce n'est pas un entier.");
                return;
            }

            int valeur = scanner.nextInt();
            somme += valeur;
        }

        // TODO 6 : Afficher leur somme.
        System.out.println("Somme : " + somme);
    }

    // ========================================
    // 02 - STATISTIQUES
    // ========================================

    public static void test02Statistiques() {

        int[] nombres = {12, 45, 8, 23, 67, 15};

        // TODO 1 : Initialiser somme, min et max.
        long somme = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cpt = 0 ;
        // TODO 2 : Parcourir nombres avec for-each.
        for (Integer n : nombres ){
            cpt++;
            System.out.println(n);
            somme += n;
            max=Math.max(max,n);
            min = Math.min(min,n);
        }
        // TODO 3 : Calculer la somme.


        // TODO 4 : Trouver min et max avec Math.
        // TODO 5 : Calculer la moyenne en double.
        double moyenne = somme/cpt;
        // TODO 6 : Afficher tous les résultats.
        System.out.println("Somme : " +somme );
        System.out.println("Moyenne : " +moyenne );
        System.out.println("Max : " +max );
        System.out.println("Min : " +min );
    }

    // ========================================
    // 03 - ARRAYLIST
    // ========================================

    public static void test03ArrayList() {

        List<String> noms = new ArrayList<>();

        // TODO 1 : Ajouter Alice, Bob, Charlie.
        noms.add("Alice");
        noms.add("Bob");
        noms.add("Charlie");

        // TODO 2 : Afficher la liste.
        System.out.println(noms);
        // TODO 3 : Afficher l'élément à l'indice 1.
        System.out.println(noms.get(1));

        // TODO 4 : Afficher la taille.
        System.out.println(noms.size());
        // TODO 5 : Supprimer Bob.
        noms.remove("Bob");
        // TODO 6 : Ajouter David à l'indice 1.
        noms.add("David");
        // TODO 7 : Afficher la liste finale.
        System.out.println(noms);
    }

    // ========================================
    // 04 - FOR-EACH ET CONTAINS
    // ========================================

    public static void test04ForEach() {

        List<String> noms = new ArrayList<>(
                List.of("Alice", "Bob", "Charlie")
        );

        // TODO 1 : Parcourir la liste avec for-each.
        for(String n : noms){
            System.out.println(noms);
        }
        // TODO 2 : Afficher chaque nom.
        // TODO 3 : Tester contains("Bob").
        System.out.println(noms.contains("Bob"));
        // TODO 4 : Tester contains("David").
        System.out.println(noms.contains("David"));
        // TODO 5 : Afficher les deux résultats.
    }

    // ========================================
    // 05 - HASHSET
    // ========================================

    public static void test05HashSet() {

        List<String> noms = List.of(
                "Alice", "Bob", "Alice",
                "Charlie", "Bob", "David"
        );

        // TODO 1 : Créer un HashSet<String>.
        HashSet<String> hashNom = new HashSet<>();
        // TODO 2 : Ajouter les éléments de noms.
        for(String n : noms){
            hashNom.add(n);
        }
        // TODO 3 : Afficher les noms uniques.
        System.out.println(hashNom);
        // TODO 4 : Afficher le nombre de noms uniques
        System.out.println(hashNom.size());
        //  System.out.println(noms);.
        // TODO 5 : Vérifier la présence de Bob.
        System.out.println(hashNom.contains("Bob"));
        // TODO 6 : Supprimer David du HashSet.
        hashNom.remove("David");
        System.out.println(hashNom);
        System.out.println(hashNom.size());
    }

    // ========================================
    // 06 - HASHMAP
    // ========================================

    public static void test06HashMap() {

        Map<String, Integer> visites = new HashMap<>();

        // TODO 1 : Enregistrer Alice -> 3.
        visites.put("Alice",3);
        // TODO 2 : Enregistrer Bob -> 5.
        visites.put("Bob",5);
        // TODO 3 : Enregistrer Charlie -> 2.
        visites.put("Charlie",2);
        // TODO 4 : Récupérer les visites de Bob.
        System.out.println(visites.get("Bob"));
        // TODO 5 : Vérifier si David est une clé.
        System.out.println(visites.containsKey("David"));
        // TODO 6 : Parcourir la Map avec entrySet().
       for (Map.Entry<String ,Integer> v : visites.entrySet()){
            System.out.println("Nom : "+v.getKey()+" "+ v.getValue() + " visites");
       }
        // TODO 7 : Afficher nom et nombre de visites.
    }

    // ========================================
    // 07 - GETORDEFAULT : OCCURRENCES
    // ========================================

    public static void test07Occurrences() {

        List<String> noms = List.of(
                "Alice", "Bob", "Alice",
                "Charlie", "Bob", "Alice"
        );

        Map<String, Integer> compteur = new HashMap<>();

        // TODO 1 : Parcourir les noms.
        for (String n : noms){
            System.out.println(n);
            int actuelle = compteur.getOrDefault(n,0);

            actuelle++;
            compteur.put(n,actuelle);
        }
        // TODO 2 : Pour chaque nom, récupérer son
        //          compteur avec getOrDefault(nom, 0).

        // TODO 3 : Ajouter 1 au compteur.
        // TODO 4 : Enregistrer avec put().

        // TODO 5 : Afficher avec entrySet().
        for(Map.Entry<String,Integer> n : compteur.entrySet()){
            System.out.println("Nom : "+ n.getKey()+" "+n.getValue()+" visites");
        }

    }

    // ========================================
    // 08 - COLLECTIONS.SORT
    // ========================================

    public static void test08Tri() {

        List<Integer> nombres = new ArrayList<>(
                List.of(45, 12, 78, 3, 29)
        );

        // TODO 1 : Trier en ordre croissant.
        Collections.sort(nombres);
        // TODO 2 : Afficher les nombres.
        System.out.println("Croissant : "+nombres);
        // TODO 3 : Trier en ordre décroissant.
        Collections.sort(nombres,Collections.reverseOrder());
        // TODO 4 : Afficher les nombres.
        System.out.println("Décroissant :"+nombres);

        List<String> noms = new ArrayList<>(
                List.of("Charlie", "Alice", "Bob")
        );

        // TODO 5 : Trier les noms alphabétiquement.
        Collections.sort(noms);
        // TODO 6 : Afficher les noms.
        System.out.println(noms);
    }

    // ========================================
    // 09 - FICHIERS
    // ========================================

    public static void test09Fichier()
            throws FileNotFoundException {

        // TODO 1 : Créer un fichier "celebrites.txt"
        //          avec PrintWriter.


        // Écrire ces trois lignes :
        // Alice;25
        // Bob;32
        // Charlie;18

        //

        PrintWriter writer = new PrintWriter("C:\\Users\\fsera\\IdeaProjects\\JavaEISC4_Entrainement\\src\\main\\java\\revision\\eval\\finale\\listes\\celebritesWhriter.txt");
        writer.println("Alice;25");
        writer.println("Bob;32");
        writer.println("Charlie;18");
        writer.close();

        // TODO 3 : Ouvrir le fichier avec Scanner.
        Scanner scanner = new Scanner(new File(""
                +"C:\\Users\\fsera\\IdeaProjects\\JavaEISC4_Entrainement\\src\\main\\java\\revision\\eval\\finale\\listes\\celebrites.txt"));
        // TODO 4 : Parcourir les lignes.

        while(scanner.hasNextLine()){
            String ligne = scanner.nextLine();
            // TODO 5 : Utiliser split(";").
            String[] colonne = ligne.split(";");
            // TODO 6 : Récupérer le nom.
            String name =  colonne[0];
            // TODO 7 : Convertir l'âge avec parseInt().
            int age = Integer.parseInt(colonne[1]);
            // TODO 8 : Afficher chaque personne.
            System.out.println("Nom : "+name+" "+age+" ans");
        }

        scanner.close();


        // TODO 8 : Afficher chaque personne.
        // TODO 9 : Fermer le Scanner.
    }

    // ========================================
    // 10 - MINI-DS CELEBRITES
    // ========================================


    public static void test10MiniDS() {

        List<String> noms = List.of(
                "Alice", "Bob", "Charlie",
                "Alice", "David", "Bob",
                "Alice", "Charlie", "Alice"
        );

        // TODO 1 : Compter le nombre total de visites.
        int totalsize = noms.size();

        // TODO 2 : Créer un HashSet des noms uniques.
        HashSet<String> hasnoms = new HashSet<>();

        for (String n : noms) {
            hasnoms.add(n);
        }

        // TODO 3 : Afficher le nombre de célébrités.
        System.out.println("Nombre de célébrités : " + hasnoms.size());

        // TODO 4 : Créer une HashMap des occurrences.
        HashMap<String, Integer> compteur = new HashMap<>();

        // TODO 5 : Parcourir tous les noms.
        // TODO 6 : Remplir la HashMap.
        for (String n : noms) {
            compteur.put(n, compteur.getOrDefault(n, 0) + 1);
        }

        // TODO 7 : Trouver la personne la plus fréquente.
        String plusFrequent = "";
        int maximum = 0;

        for (Map.Entry<String, Integer> c : compteur.entrySet()) {

            if (c.getValue() > maximum) {
                maximum = c.getValue();
                plusFrequent = c.getKey();
            }
        }

        System.out.println("Occurrences : " + compteur);

        // TODO 8 : Copier les noms uniques dans une ArrayList.
        ArrayList<String> listeTriee = new ArrayList<>();

        for (String n : hasnoms) {
            listeTriee.add(n);
        }

        // TODO 9 : Trier cette ArrayList.
        Collections.sort(listeTriee);

        // TODO 10 : Afficher le bilan complet.
        System.out.println("Total des visites : " + totalsize);
        System.out.println("Nombre de célébrités distinctes : " + hasnoms.size());
        System.out.println("Plus fréquente : " + plusFrequent);
        System.out.println("Nombre de visites : " + maximum);
        System.out.println("Liste triée : " + listeTriee);
    }



    public static void testComparatorIntelliJ() {

        List<String> animaux = new ArrayList<>(
                List.of("Elephant", "Chat", "Lion", "Hippopotame")
        );

        // MISSION 2 :
        // Trier les noms du plus court au plus long.
        animaux.sort(Comparator.comparingInt(String::length));
        // Chercher la méthode avec IntelliJ.

    }

}
