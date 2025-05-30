public class ManageMapClass {
    private DataBaseManager db = new DataBaseManager();

    public List<Pin> submit() {
        return db.queryPins();
    }

    public Field getPinInfo(int pinId) {
        return db.queryPinInfo(pinId);
    }

    public String getMoreInfo(int fieldId) {
        return db.queryMoreInfo(fieldId);
    }

    public Route getRoute(Location userLoc, Field destination) {
        return db.queryRoute(userLoc, destination);
    }

    public List<Field> searchFields(String query) {
        return db.queryResults(query);
    }
}
