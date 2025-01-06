public class Wine extends Product{
    private double volume;
 //   private static final double wineTax = (100+20)*(110/100);
private static final double wineTax = 1.1;

    public Wine(String name, int barCode, double price, double volume){
        super(name, barCode, price);
        this.volume=volume;
    }
    @Override
    public String toString() {
        return super.toString() + ", volume of the bottle is: " + volume + " liters";
    }

    @Override
    public double productPrice() {
        return super.productPrice() * wineTax;
    }
}
