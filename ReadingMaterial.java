package OOADlogic;

public class ReadingMaterial {
    private double price;
    private String title;
    ReadingMaterial(double price, String title){
        this.price = price;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
}
