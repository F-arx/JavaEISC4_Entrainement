package revision.eval.finale.listes.zoo;

public class Cat extends Animal implements Vocal{
    public Cat(int hunger, String name) {
        super(hunger, name);
    }

    @Override
    public void eat(Food food) {

        if ("Carotte".equals(food.getName())) {
            System.out.println("Le chat refuse la carotte");
            return;
        }

        super.eat(food);
    }
}
