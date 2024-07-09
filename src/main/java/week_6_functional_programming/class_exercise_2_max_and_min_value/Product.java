package week_6_functional_programming.class_exercise_2;

public class Product {

    int id;
    String productName;
    float price;

    public Product(int id, String productName, float price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
