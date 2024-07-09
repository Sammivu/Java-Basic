package week_6_functional_programming.class_exercise_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();


        productList.add(new Product(1, "Phone", 300000));
        productList.add(new Product(2, "Rice",200000));
        productList.add(new Product(3, "Beans", 76000));
        productList.add(new Product(4, "Garri", 30000));

        //To get the max price
        Product maxPrice= productList.stream()
                .max((prod1, prod2) -> prod1.price > prod2.price? 1: -1).get();
        System.out.println(maxPrice.price);

        // To get the min price
        Product minPrice = productList.stream()
                .min((prod1, prod2)-> prod1.price>prod2.price? 1: -1).get();
        System.out.println(minPrice.price);
    }
}
