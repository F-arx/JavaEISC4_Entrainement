package revision.eval.finale.listes.zoo;

public class Animal {
    private String name;
    private int hunger;

    public Animal(int hunger, String name) {
        this.hunger = hunger;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat(Food food) {

        hunger = Math.max(0, hunger - food.getNutrition());

        System.out.println(
                name + " mange " + food.getName()
        );
    }
}
