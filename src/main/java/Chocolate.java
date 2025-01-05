public class Chocolate extends Product {
    private double weight;

    public Chocolate(String name, int barCode, double price, double weight) {
        super(name, barCode, price);
        this.weight = weight;
    }


    @Override
    public double productPrice() {
        return super.productPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", chocolate weight is: " + weight + " grams";
    }
}
