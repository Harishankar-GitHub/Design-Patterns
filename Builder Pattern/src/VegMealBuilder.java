public class VegMealBuilder extends MealBuilder {

    private final Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void addBiriyani() {
        this.meal.setBiriyani("Veg");
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
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
