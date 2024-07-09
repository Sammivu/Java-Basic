package week_6_functional_programming.class_activity_8a_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List<Float> priceList   = new ArrayList<>();

        productList.add(new Product(1, "Phone", 25000.0f));
        productList.add((new Product(2, "Beans", 30000.0f)));
        productList.add((new Product(3, "Rice", 90000.0f)));
        productList.add((new Product(4, "Bread", 5000.0f)));

        for(Product product: productList){
            if(product.price< 30000){
                priceList.add(product.price);
            }
        }
        System.out.println(priceList);
    }
}