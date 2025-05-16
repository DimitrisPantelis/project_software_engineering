import java.util.List;

public class CourtSearchController {
    private Database db;

    public CourtSearchController(Database db) {
        this.db = db;
    }

    public List<Court> getCourtsBySport(String sport) {
        return db.findCourtsBySport(sport);
    }

    public List<Court> getCourtsByRegion(String region) {
        return db.findCourtsByRegion(region);
    }

    public List<Court> getCourtsByFilter(String sport, String region, boolean sortByPrice) {
        return db.findCourtsByFilters(sport, region, sortByPrice);
    }

    public boolean isCourtAvailable(String courtId) {
        return db.checkAvailability(courtId);
    }
}
