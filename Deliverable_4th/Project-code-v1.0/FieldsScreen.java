public class FieldsScreen {
    private ManageField manager = new ManageField();

    public void display() {
        System.out.println("Οθόνη γηπέδων.");
    }

    public void setSport(String sport) {
        manager.getSport(sport);
        getFields();
    }

    public void getFields() {
        String[] fields = manager.getFields();
        showResults(fields);
    }

    public void applyFilters(String filter) {
        manager.setFilters(filter);
        getFields();
    }

    public void searchRegion(String region) {
        manager.setSearchBar(region);
        getFields();
    }

    public void showResults(String[] fields) {
        System.out.println("Διαθέσιμα γήπεδα:");
        for (String field : fields) {
            System.out.println("- " + field);
        }
    }

    public void NoAvailableFieldScreen() {
        System.out.println("Δεν υπάρχουν διαθέσιμα γήπεδα.");
    }
}
