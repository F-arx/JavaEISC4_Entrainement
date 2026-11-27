package V2_entrainement.eval.terminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testScanner2();

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        //summarizeFixedCount(scanner);
        summarizeFixedCount2(scanner);

    }
    public static void testScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une liste de valeur sous le frome : ");
        System.out.println();
        System.out.println(scanner.nextLine());
        int n = scanner.nextInt();
        System.out.println(n);
        scanner.close();
    }

    public static void testScanner2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        int n = scanner.nextInt();
        System.out.println(n);
        int m = scanner.nextInt();
        System.out.println(m);
        System.out.println(scanner.nextLine().length());
        String str = scanner.nextLine();
    }

    static void summarizeFixedCount(Scanner scanner) {

        System.out.println("Combien de nombres voulez-vous saisir ?");
        int taille = scanner.nextInt();

        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Entrez vos nombres :");
        int currentInt;

        for (int i = 0; i < taille; i++) {

            currentInt = scanner.nextInt();

            sum += currentInt;

            if (currentInt < min) {
                min = currentInt;
            }
            if(currentInt>=max){
                max = currentInt;
            }
        }
        long moyenne = sum/taille;

        System.out.println("Effectif = " + taille);
        System.out.println("Somme = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        System.out.println("Moyenne = "+moyenne);


        if (taille == 0) {
            System.out.println("Aucune valeur");
        }
    }


    public static void summarizeFixedCount2(Scanner scanner){
        System.out.println("Entre une taille");
        int taille = scanner.nextInt();

        System.out.println("Entre vos valeur");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        int currentValue;
        for(int i = 0; i < taille; i++){
            currentValue = scanner.nextInt();
            sum += currentValue;
            if(min>currentValue){
                min = currentValue;
            }
            if(max<currentValue){
                max = currentValue;
            }
        }
        long moyenne = sum/taille;
        System.out.println("Effectif = "+taille);

        System.out.println("Somme = "+sum);
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Moyenne = "+moyenne);
    }
    }
