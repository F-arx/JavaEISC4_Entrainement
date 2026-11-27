package fr.univ_eiffel.entrainement.Final;

public class Food implements Comparable<Food>{
    private final String name;
    private final int energy;

    public Food(String name, int energy) {
        if(name.isBlank() || energy <= 0)
        {
            throw new IllegalArgumentException("invalid");
        }
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }


    @Override
    public int compareTo(Food o) {
        if(this.energy == o.energy){
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.energy, o.energy);
    }
}
