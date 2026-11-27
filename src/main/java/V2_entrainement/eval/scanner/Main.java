
package V2_entrainement.eval.scanner;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        // Choisis la méthode que tu veux tester :
        // testFichier();
        //testScanneurFamille();
        // testScanner();

        //testDossierMedical();

    }

    // ========================================
    // EXERCICE 1 : SAISIE D'UN VISITEUR
    // ========================================

    public static void testFichier() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prénom : ");
        String prenom = scanner.next();

        System.out.print("Âge : ");
        int age = scanner.nextInt();

        System.out.print("Prix du billet : ");
        double prix = scanner.nextDouble();

        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Prix du billet : " + prix);
    }

    // ========================================
    // EXERCICE 2 : FORMULAIRE FAMILLE
    // ========================================

    public static void testScanneurFamille() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formulaire famille");

        System.out.print("Nombre de visiteurs : ");
        int tailleFamille = scanner.nextInt();

        if (tailleFamille <= 0) {
            System.out.println("Nombre de visiteurs invalide.");
            return;
        }

        // Consommer le retour à la ligne après nextInt()
        scanner.nextLine();

        ArrayList<String> prenoms = new ArrayList<>();

        for (int i = 0; i < tailleFamille; i++){
            System.out.print("Prenom du visiteur "+(1+i)+" : ");
            String prenom = scanner.nextLine();
            prenoms.add(prenom);
            System.out.println("Visiteur enregistré : " + prenom);
        }
        System.out.println("Famille enregistrée : " + prenoms);
        System.out.println("Nombre de visiteurs : " + prenoms.size());

    }

    // ========================================
    // EXERCICE 3 : STATISTIQUES SUR DES NOMBRES
    // ========================================

    public static void testScanner() {
        Scanner scanner = new Scanner(System.in);

        long somme = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Combien de nombres ? : ");
        int nombre = scanner.nextInt();

        if (nombre <= 0) {
            System.out.println("Le nombre doit être strictement positif.");
            return;
        }

        System.out.println("Entrez vos nombres : ");

        for (int i = 0; i < nombre; i++) {

            int currentInt = scanner.nextInt();

            System.out.println("Nombre " + (i + 1) + " : " + currentInt);

            somme += currentInt;
            min = Math.min(min, currentInt);
            max = Math.max(max, currentInt);
        }

        double moyenne = (double) somme / nombre;

        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }

    ////




    public static void testLectureFichier() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(
                "C:\\Users\\fsera\\IdeaProjects\\JavaEISC4_Entrainement\\src\\main\\java\\nombres.txt"
        ));

        int somme = 0;
        int nombre;
        int compteur=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            nombre = scanner.nextInt();
            somme += nombre;
            compteur++;
            min = Math.min(min,nombre);
            max = Math.max(max,nombre);
        }

        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + somme/compteur);
        System.out.println("max : " + max);
        System.out.println("min : " + min);

        scanner.close();
    }

    public static void testAnimauxFichier()
            throws FileNotFoundException {

        // Ton code ici
        Scanner scanner = new Scanner(new File("" +
                        "C:\\Users\\fsera\\IdeaProjects\\JavaEISC4_Entrainement\\src\\main\\java\\animaux"));

        int compteur =0;
        String name;
        while(scanner.hasNextLine()){
            compteur++;
            name = scanner.nextLine();
            System.out.println("Animal n°"+(compteur)+" : " + name);
        }
        System.out.println(compteur + " animaux enregistrés.");
    }


    public static void testDossierMedical()
            throws FileNotFoundException {

        try (Scanner scanner = new Scanner(new File("soins.txt"))) {

            int compteur = 0;
            double poidsTotal = 0;

            while (scanner.hasNextLine()) {

                // Lire une ligne complète
                String ligne = scanner.nextLine();

                // Séparer les informations
                String[] colonnes = ligne.split(";");

                // Vérifier qu'il y a bien 3 colonnes
                if (colonnes.length != 3) {
                    continue;
                }

                // Récupérer et convertir les informations
                String nom = colonnes[0];
                int age = Integer.parseInt(colonnes[1]);
                double poids = Double.parseDouble(colonnes[2]);

                // Afficher l'animal
                System.out.println(
                        "Animal : " + nom
                                + " | Age : " + age + " ans"
                                + " | Poids : " + poids + " kg"
                );

                compteur++;
                poidsTotal += poids;
            }

            System.out.println("Nombre d'animaux : " + compteur);

            if (compteur > 0) {
                System.out.println(
                        "Poids moyen : " + poidsTotal / compteur
                );
            }
        }
    }


}


