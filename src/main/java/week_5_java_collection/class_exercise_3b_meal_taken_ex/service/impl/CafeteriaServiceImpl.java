package week_5_java_collection.class_exercise_3b_meal_taken_ex.service.impl;

import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.Cafeteria;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.DecaDevs;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.model.DecaDevsComparator;
import week_5_java_collection.class_exercise_3b_meal_taken_ex.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

    PriorityQueue<DecaDevs>  devsOnQueue = new PriorityQueue<>();


    public CafeteriaServiceImpl(){
        devsOnQueue =new PriorityQueue<>(new DecaDevsComparator());

    }

    @Override
    public void addDevs(DecaDevs devs) {
        devsOnQueue.add(devs);

    }

    @Override
    public String collectMeal(Cafeteria meal) {

        if (devsOnQueue.isEmpty()){
            return  "No devs on the queue";
        }

        DecaDevs decaDevs = devsOnQueue.poll();

        return decaDevs.getFullName()+ " has taken "+ meal.getMealType()+ ".";
    }
}
