package revision.eval.finale.listes.zoo;

public class Food implements Comparable {
    private String name;
    private int nutrition;

    public Food(int nutrition, String name) {
        this.nutrition = nutrition;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNutrition() {
        return nutrition;
    }

    @Override
    public int compareTo(Food o) {
        return Integer.compare(this.nutrition,o.nutrition);
    }
}
