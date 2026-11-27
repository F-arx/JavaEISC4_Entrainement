package V2_entrainement.eval.alimentation;

public class Main {
    public static void main(String[] args) {
        Food thon = new Food("Thon", 4,"Poisson");
        System.out.println(thon.getName());
        System.out.println(thon.getNutrition());
        Food Saumon = new Food("Saumon",120, "Poisson");
        Food Croquettes = new Food("Croquettes",350,"Viande");
        Food Carotte = new Food("Carotte",40,"Vegetal");


        try {
            new Food("Thon", 0,"Poisson");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}