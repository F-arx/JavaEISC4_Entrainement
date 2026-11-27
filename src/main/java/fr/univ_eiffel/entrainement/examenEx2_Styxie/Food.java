package fr.univ_eiffel.entrainement.examenEx2_Styxie;


public class Food implements Comparable<Food>{
    private final String name;
    private final int energy;
    private final double price;

    public Food(String name, int energy, double price) {
        if(name == null)
        {
            throw new IllegalArgumentException("name null");
        }
        if(name.isBlank()|| energy <= 0 || price < 0){
            throw new IllegalArgumentException("name empty or null, energy negative or null, price negative");
        }
        this.name = name;
        this.energy = energy;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", price=" + price +
                '}';
    }


    @Override
    // (retour < 0 si this est inférieur, > 0 si this est supérieur, == 0 en cas d’égalité)
    public int compareTo(Food o) {
        if(this.energy - o.energy == 0){
            if(this.price - o.price == 0)
            {
                    return this.name.compareTo(o.name);
            }
            return Double.compare(this.price, o.price);
        }
        return (this.energy - o.energy);
    }
}
