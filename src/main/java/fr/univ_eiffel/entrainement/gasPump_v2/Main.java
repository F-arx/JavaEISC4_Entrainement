package fr.univ_eiffel.entrainement.gasPump_v2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Gaspump_V2 pump_dans_la_france_a_macron = new Gaspump_V2(100, 2);
        Gaspump_V2 pump_dans_la_france_a_melanchon = new Gaspump_V2(1000, 1);

        System.out.println(pump_dans_la_france_a_macron);

        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.fill(80);
        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.sell(25);
        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.addBills(20,3);
        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.addBills(20,2);
        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.addBills(50,1);
        pump_dans_la_france_a_macron.display_all();

        try {
            pump_dans_la_france_a_macron.addBills(7,1);
        }catch (IllegalArgumentException e){
            System.out.println("error : " + e.getMessage());
        }
        pump_dans_la_france_a_macron.display_all();
        try {
            pump_dans_la_france_a_macron.sell(105);
        }catch (IllegalArgumentException e){
            System.out.println("error : " + e.getMessage());
        }
        pump_dans_la_france_a_macron.display_all();


        try {
            pump_dans_la_france_a_macron.takeGas(20);
        }catch (IllegalArgumentException e){
            System.out.println("error : " + e.getMessage());
        }
        pump_dans_la_france_a_macron.display_all();
        pump_dans_la_france_a_macron.setPrice(100);
        pump_dans_la_france_a_macron.display_all();
        System.out.println(pump_dans_la_france_a_macron.getTotalBillsValue());


        System.out.println(pump_dans_la_france_a_macron == pump_dans_la_france_a_melanchon);
        System.out.println(pump_dans_la_france_a_macron.equals(pump_dans_la_france_a_melanchon));
        System.out.println(pump_dans_la_france_a_macron.hashCode() == pump_dans_la_france_a_melanchon.hashCode());

        pump_dans_la_france_a_macron.fill(20);

        System.out.println(pump_dans_la_france_a_macron.equals(pump_dans_la_france_a_melanchon));

        Gaspump_V2 p1 = new Gaspump_V2(100, 2);
        Gaspump_V2 p2 = new Gaspump_V2(100, 2);

        System.out.println("    P1 and P2");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());

        p1.fill(20);


        System.out.println(p1.equals(p2));


        //testHashMaps();
    }



    public static void testHashMaps (){
        HashMap<String,Integer> liste = new HashMap<>();
        liste.put("Fabio",18);
        liste.put("Jade",2);
        System.out.println(liste);
    }
}
