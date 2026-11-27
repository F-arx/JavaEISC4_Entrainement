package revision.eval.finale.listes.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Créer les nourritures
        Food saumon = new Food("Saumon", 20);
        Food carotte = new Food("Carotte", 10);

        // 2. Créer le chat
        Cat mia = new Cat("Mia", 50);

        // 3. Faire miauler le chat
        mia.makeSound();

        // 4. Lui donner du saumon
        mia.eat(saumon);

        // 5. Lui proposer une carotte
        mia.eat(carotte);

        // 6. Afficher sa faim finale
        System.out.println("Faim finale : " + mia.getHunger());

        // 7. Créer une liste de nourritures
        List<Food> foods = new ArrayList<>();

        foods.add(saumon);
        foods.add(carotte);
        foods.add(new Food("Poulet", 15));

        // 8. Trier les nourritures
        Collections.sort(foods);

        // 9. Afficher les nourritures triées
        for (Food food : foods) {
            System.out.println(
                    food.getName() + " : " + food.getNutrition()
            );
        }
    }
}
