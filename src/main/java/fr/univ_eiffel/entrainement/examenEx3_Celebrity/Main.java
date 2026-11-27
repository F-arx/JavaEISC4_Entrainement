package fr.univ_eiffel.entrainement.examenEx3_Celebrity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Celebrity> celebrities = new ArrayList<>();

        celebrities.add(new Celebrity("Albert Einstein", 1879, 1955));
        celebrities.add(new Celebrity("Marie Curie", 1867, 1934));
        celebrities.add(new Celebrity("Alan Turing", 1912, 1954));
        celebrities.add(new Celebrity("Ada Lovelace", 1815, 1852));
        celebrities.add(new Celebrity("Simone Veil", 1927, 2017));
        celebrities.add(new Celebrity("Thomas Pesquet", 1978, 0));
        List<Celebrity> sortedcelebrities = new ArrayList<>(celebrities);


        System.out.println("Average birth year: "
                + CelebrityStats.averageBirthYear(celebrities));

        System.out.println("Oldest birth: "
                + CelebrityStats.oldestBirth(celebrities));

        System.out.println("Living celebrities: "
                + CelebrityStats.countLiving(celebrities));

        System.out.println("Celebrities by century: "
                + CelebrityStats.countByCentury(celebrities));

        if(celebrities != null){
            Comparator<Celebrity> celebrityComparator = Comparator.comparingInt(Celebrity::getBirthYear);
            sortedcelebrities.sort(celebrityComparator);
        }

        System.out.println(sortedcelebrities);


    }
}