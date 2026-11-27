package fr.univ_eiffel.entrainement.examenv2ex1;

import java.util.Comparator;

public class Parcel implements Comparable<Parcel> {
    private final String reference;
    private final int weight;
    private int priority;


    public Parcel(String reference, int weight, int priority) {
       if(reference == null || reference.isBlank() || weight <= 0 || priority <= 0 || priority > 5)
       {
           throw new IllegalArgumentException("invalid arguments");
       }
        this.reference = reference;
        this.weight = weight;
        this.priority = priority;
    }

    public String getReference() {
        return reference;
    }

    public int getWeight() {
        return weight;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "reference='" + reference + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                '}';
    }


    @Override
    public int compareTo(Parcel o) {
        if(this.priority == o.priority){
            if(this.weight == o.weight){
                return this.reference.compareTo(o.reference);
            }
            return this.weight - o.weight;

        }
        return o.priority - this.priority;

    }
}
