package fr.univ_eiffel.entrainement.examEx1_Styxie;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last_number;
        int sum = 0;
        int N_Values = 0;
        int N_evens = 0;
        double average;
        int biggest = 0;
        int smallest = 0;
        boolean first = true;

        try {
            while (scanner.hasNextInt()) {
                last_number = scanner.nextInt();

                if (last_number == -1) {
                    if(N_Values > 0){
                        average = (double) sum / N_Values;
                    } else {
                        System.out.println("Aucun nombre saisi....");
                        break;
                    }

                    System.out.println(
                            "N_Values = " + N_Values + "   " +
                            "Sum = " + sum + "   " +
                            "Average = " + average + "   " +
                            "Smallest = " + smallest  + "   " +
                            "Biggest = " + biggest + "   " +
                            "N_evens = " + N_evens + "   "
                    );
                    break;
                }
                N_Values++;
                sum += last_number;
                if (biggest < last_number || first) {
                    biggest = last_number;
                }
                if (smallest > last_number || first) {
                    smallest = last_number;
                }
                int Modulo = (last_number % 2);
                if (Modulo == 0) {
                    N_evens += 1;
                }
                first = false;
              }
            scanner.close();

        } catch (IllegalStateException e) {
            System.out.println("Error : " + e);

        }
    }
}
