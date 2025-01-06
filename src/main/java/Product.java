public class Product {
    String name;
    int barCode;
    double price;

    //private static final double tax = (100 + 20) / 100;

    private static final double tax = 1.2;

    public Product(String name, int barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }


    public String toString() {
        return "Product: " + name + ", with bar code: " + barCode + ", has a standard price: " + price
                + ", and price after taxes: " + productPrice();
    }

    public double productPrice() {
        return price * tax;
    }
}
