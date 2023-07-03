public class NonVegMealBuilder extends MealBuilder {

    private final Meal meal;

    public NonVegMealBuilder(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void addBiriyani() {
        this.meal.setBiriyani("Non-Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Sprite");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non-Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
