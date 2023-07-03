public class Main {

    public static void main(String[] args) {
        // Builder Pattern Using Builder Class.
        Burger burger = new Burger.BurgerBuilder()
                .extraMayonnaise(true)
                .withOnion(true)
                .withEgg(false)
                .extraCheese(true)
                .withSize("LARGE")
                .build();

        // Builder Pattern Using Builder and Director concept.
        Meal vegMeal = new MealDirector(new VegMealBuilder()).preparedMeal();
    }
}
