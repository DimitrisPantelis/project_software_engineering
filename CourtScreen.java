import java.util.List;

public class CourtScreen {
    private CourtSearchController controller;

    public CourtScreen(CourtSearchController controller) {
        this.controller = controller;
    }

    public void displayCourtsBySport(String sport) {
        List<Court> courts = controller.getCourtsBySport(sport);
        showCourts(courts);
    }

    public void filterAndDisplay(String sport, String region, boolean sortByPrice) {
        List<Court> courts = controller.getCourtsByFilter(sport, region, sortByPrice);
        showCourts(courts);
    }

    public void showCourts(List<Court> courts) {
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
}
