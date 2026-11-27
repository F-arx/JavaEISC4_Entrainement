package V2_entrainement.eval.alimentation;

public class Animal {
    private final String name;
    private int hunger;

    public Animal(String name, int hunger) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name can't be null or blank");
        }
        if (hunger < 0) {
            throw new IllegalArgumentException("Invalid hunger level");
        }

        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                '}';
    }

    // public boolean eat(Food food)
}