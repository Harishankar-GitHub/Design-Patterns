public class MealDirector {

    private final MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal preparedMeal() {
        mealBuilder.addBread();
        mealBuilder.addBiriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
}
