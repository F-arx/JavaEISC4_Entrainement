
package V2_entrainement.eval.alimentation;

public class Food implements Comparable<Food> {

    private final String name;
    private final int nutrition;
    private final String category;

    // Constructeur
    public Food(String name, int nutrition, String category) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (nutrition <= 0) {
            throw new IllegalArgumentException("Invalid nutrition score");
        }

        if (!"Poisson".equals(category) &&
                !"Viande".equals(category) &&
                !"Vegetal".equals(category)) {
            throw new IllegalArgumentException("Invalid category");
        }

        this.name = name;
        this.nutrition = nutrition;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNutrition() {
        return nutrition;
    }

    public String getCategory() {
        return category;
    }

    // Comparaison par valeur nutritionnelle croissante
    @Override
    public int compareTo(Food other) {
        return Integer.compare(this.nutrition, other.nutrition);
    }

    // Affichage
    @Override
    public String toString() {
        return name + " | Nutrition : " + nutrition
                + " | Catégorie : " + category;
    }
}
