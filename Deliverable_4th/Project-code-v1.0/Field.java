import java.util.List;

public class Field {

    private String name;
    private String sport;
    private String region;
    protected double price;
    private boolean isAvailable;

    public Field(String name, String sport, String region, double price, boolean isAvailable) {
        this.name = name;
        this.sport = sport;
        this.region = region;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public String getRegion() {
        return region;
    }

    public Double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

}