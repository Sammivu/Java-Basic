package week_5_java_collection.class_exercise_3b_meal_taken_ex;

import week_5_java_collection.class_exercise_3b_meal_taken_ex.enums.MealType;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.Cafeteria;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.DecaDevs;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {

        //Create some sample devs (Male and Female)
        DecaDevs male1 = new DecaDevs("Sampson Gbewa", false, true);
        DecaDevs female1 = new DecaDevs("Jane Mary", true, false);

        //Create a sample meal
        Cafeteria cafeteriaMeal = new Cafeteria(MealType.FRIED_RICE);

        // Create a cafeteria
        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        //Add male and female devs to the cafeteria queue to request for a meal
        cafeteriaService.addDevs(male1);
        cafeteriaService.addDevs(female1);

        //Give out meal
        System.out.println(cafeteriaService.collectMeal(cafeteriaMeal));




    }
}
