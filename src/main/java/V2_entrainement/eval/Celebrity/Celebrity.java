
package V2_entrainement.eval.Celebrity;

public class Celebrity implements Comparable<Celebrity> {

    private final String name;
    private final int birthYear;
    private int visits;

    // Constructeur principal
    public Celebrity(String name, int birthYear, int visits) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nom invalide");
        }

        if (birthYear > 2026) {
            throw new IllegalArgumentException("Année de naissance invalide");
        }

        if (visits < 0) {
            throw new IllegalArgumentException("Nombre de visites invalide");
        }

        this.name = name;
        this.birthYear = birthYear;
        this.visits = visits;
    }

    // Deuxième constructeur
    public Celebrity(String name, int birthYear) {
        this(name, birthYear, 0);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getVisits() {
        return visits;
    }

    // Calcul de l'âge
    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    // Ajouter des visites
    public void addVisit(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantité invalide");
        }

        this.visits += quantity;
    }

    // Ordre naturel : année de naissance croissante
    @Override
    public int compareTo(Celebrity other) {
        return Integer.compare(this.birthYear, other.birthYear);
    }

    // Affichage de la célébrité
    @Override
    public String toString() {
        return name + " | Naissance : " + birthYear
                + " | Visites : " + visits;
    }
}
