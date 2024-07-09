package week_5_java_collection.class_exercise_3b_meal_taken_ex.service;

import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.Cafeteria;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.DecaDevs;

public interface CafeteriaService {

    public void addDevs (DecaDevs devs);

    public String collectMeal(Cafeteria meal);
}
