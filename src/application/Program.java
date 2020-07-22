package application;

import java.util.List;
import java.util.ArrayList;
import entities.Product;
import util.PriceUpdate;

public class Program {

    public static void main(final String[] args) {

        final List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        System.out.println("After:");
        for (Product product : list) {
            System.out.println(product.toString());
        }

        //recebe um consumer como argumento e executa toda a lista de acordo com o consumer
        //assim atualizando todos os produtos da lista
        list.forEach(new PriceUpdate());

        System.out.println("\nBefore:");
        list.forEach(System.out::println);
    }
}