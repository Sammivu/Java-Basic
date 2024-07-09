package week_5_java_collection.class_exercise_age_comparator.service.impl;

import week_5_java_collection.class_exercise_age_comparator.model.CustomerComparator;
import week_5_java_collection.class_exercise_age_comparator.model.Customers;
import week_5_java_collection.class_exercise_age_comparator.model.SuperMarket;
import week_5_java_collection.class_exercise_age_comparator.service.SuperMarketService;

import java.util.PriorityQueue;

public class SuperMarketServiceImpl implements SuperMarketService {

    PriorityQueue<Customers> customersPriorityQueue;

    //Generate a constructor
    public SuperMarketServiceImpl() {
        customersPriorityQueue= new PriorityQueue<>(new CustomerComparator());

    }

    @Override
    public void addCustomersToQueue(Customers customers) {
        customersPriorityQueue.add(customers);
    }

    @Override
    public String attendToCustomers(SuperMarket itemBought) {

        //condition if nobody is on the queue
        if (customersPriorityQueue.isEmpty()){
            return "No customer on the queue";
        }
        //calling our customer
        Customers customers =customersPriorityQueue.poll();
        return customers.getFullName()+ " has bought "+ itemBought.getItem()+ " ";
    }
}
