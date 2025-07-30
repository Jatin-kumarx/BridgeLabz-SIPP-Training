public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.println("Generated: " + meal.type.getPlan());
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        generateMeal(veg);
    }
}