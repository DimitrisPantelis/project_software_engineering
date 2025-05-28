import java.util.List;

public class FieldScreen {

    private String name;
    private String sport;
    private String region;
    private double price;
    private boolean available;

    public void public class FieldScreen(String name, String sport, String region, double price, boolean available) {
        this.name = name;
        this.sport = sport;
        this.region = region;
        this.price = price;
    }

    public void display(String sport) {}

    public void getsFields(){
        showFields(Fields);
    }

    public void seFilters(String sport, String region, boolean sortByPrice){}

    public void showFields(List<Court> Fields) {
        if (Fields == null || Fields.isEmpty()) {
            System.out.println("Not available courts.");
            return;
        }
        System.out.println("Available Courts:");
        for (Fields Fields : Fields) {
            System.out.println("- " + Fields.getName() + " | Περιοχή: " + Fields.getRegion() + " | Τιμή: " + Fields.getPrice());
        }
    }

    public void setChoice(String courtId) {
        this.selectedCourtId = courtId;
        System.out.println("Επιλέχθηκε γήπεδο με ID: " + courtId);
    }

    public void setSearchBar(){
        System.out.println("Search bar is ready for input.");
    }
}
