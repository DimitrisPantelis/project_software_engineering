import java.util.List;

public class CourtScreen {
    
    public void display(String sport) {}

    public void getsCourts(){
        showCourts(courts);
    }

    public void seFilters(String sport, String region, boolean sortByPrice){}

    public void showCourts(List<Court> courts) {
        if (courts == null || courts.isEmpty()) {
            System.out.println("Not available courts.");
            return;
        }
        System.out.println("Available Courts:");
        for (Court court : courts) {
            System.out.println("- " + court.getName() + " | Περιοχή: " + court.getRegion() + " | Τιμή: " + court.getPrice());
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
