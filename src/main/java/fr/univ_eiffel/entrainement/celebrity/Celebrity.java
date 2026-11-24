package fr.univ_eiffel.entrainement.celebrity;

import java.util.Comparator;

public class Celebrity implements Comparable<Celebrity> {
    private final String name;
    private final int birthYear;

    public Celebrity(String name,int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }


    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public int getAge(int currentYears){
        return currentYears - this.birthYear;
    }

    @Override
    public int compareTo(Celebrity o) {
        return Integer.compare(this.birthYear,o.birthYear);
    }
}
