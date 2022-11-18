package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Milk("Петмол", 60.0, 5));
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Масло", 50.0));
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Product("Шоколад", 30.0));
        prods.add(new Product("Снек", 20.0));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy(30.0));
        
    }

}
