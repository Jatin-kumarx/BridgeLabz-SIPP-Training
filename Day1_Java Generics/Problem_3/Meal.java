public class Meal<T extends MealPlan> {
    T type;
    public Meal(T type) { this.type = type; }
}