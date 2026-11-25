package fr.univ_eiffel.entrainement.strings;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        //testString();
        //testPalindrome();
        //testSacanner();
        //
        // etestFichier();

    }

    public static void testString(){
        String mot = "radar";
        System.out.println(mot.length());
        System.out.println(mot.charAt(0));
        System.out.println(mot.charAt(mot.length()-1));
        System.out.println();
        for(int i=0;i<mot.length();i++){
            System.out.println(mot.charAt(i));
        }
    }

    public static boolean estPalindrome(String mot){
        for (int i = 0; i < mot.length() / 2; i++) {
            if(mot.charAt(i)!=mot.charAt(mot.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void testPalindrome() {
        String pal = "RADAR";
        System.out.println(estPalindrome(pal));
        ArrayList<String> listPal = new ArrayList<>();
        listPal.add("RADAR");
        listPal.add("KAYAK");
        listPal.add("JAVA");
        listPal.add("RESSASSER");

        System.out.println();

        for (String list : listPal){
            System.out.println(estPalindrome(list));
        }
    }

    public static void testSacanner(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Entrer un string : ");
        if(scanner.hasNextLine())
        {
            String val = scanner.nextLine();
            System.out.println("Vous avez saisi le string : " + val);
            System.out.println(estPalindrome(val));
        }
        scanner.close();
    }


    public static void testFichier() throws FileNotFoundException {

        File fichier = new File("mots.txt");

        Scanner scanner = new Scanner(fichier);

        while (scanner.hasNextLine()) {

            String mot = scanner.nextLine();

            if (estPalindrome(mot)) {
                System.out.println(mot);
            }
        }

        scanner.close();
    }

}
