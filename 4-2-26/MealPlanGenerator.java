interface MealPlan {
    String getMealType();
    int calories();
}
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
    public int calories() {
        return 1800;
    }
}
class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public int calories() {
        return 1600;
    }
}
class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public int calories() {
        return 2000;
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public int calories() {
        return 2200;
    }
}
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
class MealGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Meal Type: " + meal.getMealType());
        System.out.println("Calories: " + meal.calories());
        System.out.println("Meal plan generated successfully!\n");
    }
}
public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        MealGenerator.generateMealPlan(vegMeal.getMealPlan());
        MealGenerator.generateMealPlan(veganMeal.getMealPlan());
        MealGenerator.generateMealPlan(ketoMeal.getMealPlan());
        MealGenerator.generateMealPlan(proteinMeal.getMealPlan());
    }
}
 
