import java.util.List;

public class CourtsScreen(){
    private CourtSearchController controller;

    public CourtScreen(CourtSearchController controller) {
        this.controller = controller;
    }

    public void display(String sport){
        List<Court> courts = controller.getCourtsBySport(sport);
        showCourts(courts);
    }

    public void getsCourts(){}

    public void setFilters(String sport, String region, boolean sortByPrice){
        List<Court> courts = controller.getCourtsByFilter(sport, region, sortByPrice);
        showCourts(courts);
    }
    public void setChoice(){}
    public void setSearchBar(){}
    
    /*public void showCourts(List<Court> courts) {
        // Εμφάνιση γηπέδων στην οθόνη
    }

    public void chooseCourt(String courtId) {
        if (controller.isCourtAvailable(courtId)) {
            displayAvailable();
        } else {
            displayUnavailable();
        }
    }

    private void displayAvailable() {
        // Εναλλαγή σε AvailableCourtsScreen
    }

    private void displayUnavailable() {
        // Εναλλαγή σε NotAvailableCourtScreen
    }
    */

}