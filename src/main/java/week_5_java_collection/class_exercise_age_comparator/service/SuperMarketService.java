package week_5_java_collection.class_exercise_age_comparator.service;

import week_5_java_collection.class_exercise_age_comparator.model.Customers;
import week_5_java_collection.class_exercise_age_comparator.model.SuperMarket;

public interface SuperMarketService {

    public void addCustomersToQueue(Customers customers);

    public String attendToCustomers(SuperMarket itemBought);
}
