public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cigars", 123456, 3.5);
        System.out.println(product.toString());


        Chocolate chocolate = new Chocolate("Milka", 123654, 1.28, 100.5);
        System.out.println(chocolate.toString());


        Wine wine = new Wine("Aleksandrija", 654321, 10, 0.75);
        System.out.println(wine.toString());


    }
}
