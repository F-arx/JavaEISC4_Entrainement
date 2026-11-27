package fr.univ_eiffel.entrainement.examenv2ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Parcel> parcels = new ArrayList<>();

        parcels.add(new Parcel("A12", 500, 3));
        parcels.add(new Parcel("B07", 200, 5));
        parcels.add(new Parcel("C20", 300, 3));
        parcels.add(new Parcel("D04", 200, 5));
        parcels.add(new Parcel("E11", 500, 3));

        System.out.println(parcels);
        //parcels.sort(null);
//        Collections.sort(parcels);

        Comparator<Parcel> byPriority = Comparator.comparingInt(Parcel::getPriority);
        parcels.sort(byPriority);

        System.out.println(parcels);









    }
}
