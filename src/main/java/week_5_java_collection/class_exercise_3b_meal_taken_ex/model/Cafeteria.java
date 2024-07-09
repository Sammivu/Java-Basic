package week_5_java_collection.class_exercise_3b_meal_taken_ex.model;

import week_5_java_collection.class_exercise_3b_meal_taken_ex.enums.MealType;

public class Cafeteria {


    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
