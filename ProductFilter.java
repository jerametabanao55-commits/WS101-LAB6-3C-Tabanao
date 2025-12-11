import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Keyboard", 50.00));
        products.add(new Product("Mouse", 30.10));
        products.add(new Product("Monitor", 65.00));
        products.add(new Product("Headset", 35.00));
        products.add(new Product("SSD", 75.00));

        System.out.print("Enter price threshold: ");
        double threshold = sc.nextDouble();

        long count = products.stream()
                .filter(p -> p.price > threshold)
                .count();

        System.out.println("Number of products with price greater than " + threshold + ": " + count);

        sc.close();
    }
}
