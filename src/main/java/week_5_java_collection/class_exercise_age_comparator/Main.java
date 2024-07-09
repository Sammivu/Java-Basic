package week_5_java_collection.class_exercise_age_comparator;

import week_5_java_collection.class_exercise_age_comparator.enums.Item;
import week_5_java_collection.class_exercise_age_comparator.model.Customers;
import week_5_java_collection.class_exercise_age_comparator.model.SuperMarket;
import week_5_java_collection.class_exercise_age_comparator.service.impl.SuperMarketServiceImpl;

public class Main {
    public static void main(String[] args) {

        Customers youngCustomer = new Customers("Samuel Joseph", false, true);
        Customers oldCustomer = new Customers("John Doe", true, false);


        //create Item bought in supermarket
        SuperMarket itemBought= new SuperMarket(Item.MILK);

        // Create a Supermarket
        SuperMarketServiceImpl superMarketService = new SuperMarketServiceImpl();

        //Add customer to the queue
        superMarketService.addCustomersToQueue(youngCustomer);
        superMarketService.addCustomersToQueue(oldCustomer);

        //Attending to the customer
        System.out.println(superMarketService.attendToCustomers((itemBought)));

        System.out.println("***************************************");

        System.out.println("When two young customers are on the queue");

        //Creating Customers
        Customers youngCustomer2 = new Customers("Gift Okon", false, true);
        Customers youngCustomer1 = new Customers("Akpos Laide", false, true);


        //create Item bought in supermarket
        SuperMarket itemBought2= new SuperMarket(Item.RICE);


        // Create a Supermarket
        SuperMarketServiceImpl superMarketService2 = new SuperMarketServiceImpl();

        //Add customer to the queue
        superMarketService2.addCustomersToQueue(youngCustomer1);
        superMarketService2.addCustomersToQueue(youngCustomer2);

        //Attending to customers
        System.out.println(superMarketService2.attendToCustomers(itemBought2));





    }
}
