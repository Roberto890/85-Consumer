package application;

import java.util.List;
import java.util.function.Consumer;
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

        Double factor = 1.1;
        
        //4ª implementação
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

        System.out.println("After:");
        for (Product product : list) {
            System.out.println(product.toString());
        }

        //recebe um consumer como argumento e executa toda a lista de acordo com o consumer
        //assim atualizando todos os produtos da lista
        //1ª implementação - implementação da interface
        //list.forEach(new PriceUpdate());

        //2ª implementação - Reference method com método estático
        //list.forEach(Product::staticPriceUpdate);

        //3ª implementação - Reference method sem método estático
        //list.forEach(Product::nonStaticPriceUpdate);

        //4ª implementação - Expressão lambda declarada
        //list.forEach(cons);

        //5ª implementação - Expressão lambda Inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        System.out.println("\nBefore:");
        list.forEach(System.out::println);
    }
}