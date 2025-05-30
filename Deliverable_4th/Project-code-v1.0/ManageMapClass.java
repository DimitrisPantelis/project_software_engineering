import java.util.List;

public class ManageMapClass {
    private DataBaseManager db = new DataBaseManager();

    public List<String> setChoice() {
        return db.queryPins();
    }

    public String getPinInfo(int pinId) {
        return db.queryPinInfo(pinId);
    }

    public String getMoreInfo(int fieldId) {
        return db.queryMoreInfo(fieldId);
    }

    public String getLocation(String userLoc, Field destination) {
        return db.queryLocation(userLoc, destination);
    }

    public List<Field> searchFields(String query) {
        return db.queryResults(query);
    }
}
