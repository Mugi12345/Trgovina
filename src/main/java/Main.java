public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cigars", 123456, 3.5);
        System.out.println(product.toString());
        System.out.println("Price for cigars after taxes is: " +product.productPrice());


        Chocolate chocolate = new Chocolate("Milka", 123654, 1.28, 100.5);
        System.out.println(chocolate.toString());
        System.out.println("Price for chocolate after taxes is: " + chocolate.productPrice());


        Wine wine = new Wine("Aleksandrija", 654321, 10, 0.75);
        System.out.println(wine.toString());
        System.out.println("Price for wine after taxes is: " + wine.productPrice());


    }
}
