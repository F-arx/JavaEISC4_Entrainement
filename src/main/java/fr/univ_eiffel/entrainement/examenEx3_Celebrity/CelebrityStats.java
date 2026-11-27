package fr.univ_eiffel.entrainement.examenEx3_Celebrity;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CelebrityStats{

    public static double averageBirthYear(List<Celebrity> celebrities){
        double average = 0;
        int sum = 0;
        if(celebrities.isEmpty()){
            return 0;
        } else{
            for(int i = 0; i < celebrities.size(); i++ ){
                sum += celebrities.get(i).getBirthYear();
            }
            average = (double) sum /celebrities.size();
            return average;
        }

    }

    public static Celebrity oldestBirth(List<Celebrity> celebrities){
        Celebrity oldest;
        if(celebrities == null){
            throw new IllegalArgumentException("celebrity null");
        }
        oldest = celebrities.getFirst();
        for(int i = 1; i < celebrities.size(); i++ ){
            if(oldest.getBirthYear() > celebrities.get(i).getBirthYear())
            {
                oldest = celebrities.get(i);
            }
        }
        return oldest;
    }

    public static long countLiving(List<Celebrity> celebrities){
        long still_alive = 0;
        for(int i = 0; i < celebrities.size(); i++ ){
            if(celebrities.get(i).getDeathYear() == 0){
                still_alive++;
            }
        }
        return still_alive;
    }

    public static Map<Integer, Integer> countByCentury(List<Celebrity> celebrities){
        Map<Integer,Integer> count = new HashMap<>();
        int century;
        for(int i = 0; i < celebrities.size(); i++){
            century = ((celebrities.get(i).getBirthYear()  - 1)/ 100)+1;
            if(count.containsKey(century)){
                count.replace(century,count.get(century)+1);
            } else{
                count.put(century,1);
            }
        }
        return count;
    }


}
