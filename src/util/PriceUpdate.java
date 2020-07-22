package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
        // atualizar o valor de p com 10%
        p.setPrice(p.getPrice()*1.1);
		
	}
    
}