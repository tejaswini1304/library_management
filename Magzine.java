package OOADlogic;

public class Magzine extends ReadingMaterial {
    private String monthOfIssue;
    public Magzine(String title, double price, String monthOfIssue) {
        super(price, title);
        this.monthOfIssue = monthOfIssue;
    }
    public String getMonthOfIssue() {
        return monthOfIssue;
    }
}