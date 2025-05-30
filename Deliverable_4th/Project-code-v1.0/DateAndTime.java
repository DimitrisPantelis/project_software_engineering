public class DateAndTime {
    private ManageDateAndTime manager = new ManageDateAndTime();

    public void display() {
        System.out.println("Οθόνη επιλογής ημερομηνίας & ώρας");
    }

    public void setDate(String date) {
        manager.setDate(date);
    }

    public void setTime(String time) {
        manager.setTime(time);
    }
}
