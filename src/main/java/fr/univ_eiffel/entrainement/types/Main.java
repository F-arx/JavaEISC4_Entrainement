
package fr.univ_eiffel.entrainement.types;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Object stringVal = "121";
        Object numVal = 17;

        //testAffiche(stringVal);
        //testAffiche(numVal);

        if (numVal instanceof Integer) {
            int num = (Integer) numVal;
            testAffiche(num);
        }
        System.out.println("Méthode 1 :");
        System.out.println(testEstEntier("42"));
        System.out.println(testEstEntier("-7"));
        System.out.println(testEstEntier("bonjour"));
        System.out.println(testEstEntier("4.5"));

        System.out.println("Méthode 2 :");
        System.out.println(testEstEntier2("42"));
        System.out.println(testEstEntier2("-7"));
        System.out.println(testEstEntier2("bonjour"));
        System.out.println(testEstEntier2("4.5"));


        //exo4

        //testDdouble();
        testRecord();


    }

    public static void test(Object valeur) {
        Object stringVal = "bonjour";
        Object numVal = 17;

        System.out.println(stringVal instanceof String);

        if (stringVal instanceof String) {
            String texte = (String) stringVal;
            System.out.println(texte.toUpperCase());
        }

        System.out.println(numVal instanceof String);

        if (numVal instanceof String) {
            String texte = (String) numVal;
            System.out.println(texte);
        }

        stringVal = Integer.valueOf(12);
        System.out.println(stringVal);

        System.out.println(stringVal instanceof String);

        if (stringVal instanceof Integer) {
            Integer nombre = (Integer) stringVal;
            System.out.println(nombre * 2);
        }
    }

    public static void testAffiche(Object valeur) {
        if (valeur instanceof String) {
            String texte = (String) valeur;
            System.out.println(texte);
            // return;
        }
        else if (valeur instanceof Integer) {
            int entier = (Integer) valeur;
            System.out.println(entier);
            // return;
        }
        else {
            System.out.println("Type non pris en charge");
        }
    }

    public static boolean testEstEntier(String texte) {
        if (texte instanceof String) {
            try {
                int entier = Integer.parseInt(texte);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    public static boolean testEstEntier2(String texte) {
        try {
            int entier = Integer.parseInt(texte);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void testDdouble() {
        double x = 7.5;
        double y = 5.5;

        Point p = new Point(x, y);

        System.out.println(p);
        System.out.println(p.x());
        System.out.println(p.y());
    }

    public static void testRecord() {
        Double x = 7.5;
        Double y = 5.5;

        Point p = new Point(x, y);
        System.out.println(p);

        Double z = null;
        System.out.println(z);

        var message = "Hello my friend";
        System.out.println(message.toUpperCase(Locale.ROOT));

        p = new Point(2, 5); // Réaffectation, sans redéclarer p
        System.out.println(p);
    }

}
