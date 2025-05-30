public class TournManageClass {
    private int id;
    private String tournName;
    private String region;
    private String date;
    private String time;

    public TournManageClass(int id, String tournName, String region, String date, String time) {
        this.id = id;
        this.tournName = tournName;
        this.region = region;
        this.date = date;
        this.time = time;
    }

    public void getTournaments() {
        System.out.println("Ανάκτηση διαθέσιμων τουρνουά...");
    }

    public void setChoice(int selectedId) {
        this.id = selectedId;
        System.out.println("Επιλέχθηκε τουρνουά με ID: " + selectedId);
    }

    public void setDetails(String tournName, String region, String date, String time) {
        this.tournName = tournName;
        this.region = region;
        this.date = date;
        this.time = time;
        System.out.println("Ενημερώθηκαν τα στοιχεία τουρνουά.");
    }

    public String getInfo() {
        return "Τουρνουά: " + tournName + " | Περιοχή: " + region + " | Ημερομηνία: " + date + " | Ώρα: " + time;
    }
}
