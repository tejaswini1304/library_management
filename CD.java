package OOADlogic;

public class CD extends ReadingMaterial{
    private int durationInMinutes;
    public CD(String title, double price, int durationInMinutes) {
        super(price, title);
        this.durationInMinutes = durationInMinutes;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
