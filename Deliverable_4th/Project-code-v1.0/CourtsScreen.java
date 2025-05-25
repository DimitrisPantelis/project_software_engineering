public class CourtsScreen(){

    private String name;
    private String sport;
    private String region;
    private double price;
    private boolean available;
    private CourtSearchController controller;

    public void CourtsScreen(CourtSearchController controller,String name, String sport, String region, double price, boolean available) {
        this.controller = controller;
        this.name = name;
        this.sport = sport;
        this.region = region;
        this.price = price;
        this.available = available;
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
    public void setChoice(String courtId){
        if (controller.isCourtAvailable(courtId)) {
            displayAvailable();
        } else {
            displayUnavailable();
        }
    
    }
    public void setSearchBar(){}
    
    /*public void showCourts(List<Court> courts) {
     // Εμφάνιση γηπέδων στην οθόνη
    } */

    private void displayAvailable() {
        // Εναλλαγή σε AvailableCourtsScreen
    }

    private void displayUnavailable() {
        // Εναλλαγή σε NotAvailableCourtScreen
    }

}