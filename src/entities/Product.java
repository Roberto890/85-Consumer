package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //statico usa o produto que eu passar
    //2º forma de fazer - REFERENCE METHOD COM MÉTODO ESTATICO
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    //não estatico usa o proprio produto
    //3º forma de fazer - REFERENCE METHOD COM MÉTODO NÃO ESTATICO
    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Product [name = "+getName()+", " + "price = " + String.format("%.2f", getPrice()) + "]";
    }

    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }

}