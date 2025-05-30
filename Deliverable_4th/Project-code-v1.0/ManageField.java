public class ManageField {
    private String filter;
    private String searchBar;

    public void setFilters(String filter) {
        this.filter = filter;
    }

    public void setSearchBar(String searchBar) {
        this.searchBar = searchBar;
    }

    public void querySport(String sport) {
        System.out.println("Αναζήτηση για άθλημα: " + sport);
        // Π.χ. κάνει fetch από DB
    }

    public String[] queryFields() {
        // Π.χ. simulate αποτελέσματα
        if ("Άδειο".equals(searchBar)) {
            return new String[0];
        }
        return new String[] { "Γήπεδο Α", "Γήπεδο Β" };
    }
}
