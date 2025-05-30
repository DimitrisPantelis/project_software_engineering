public class BookingDetailsScreen {
    private ManageBooking manager = new ManageBooking();

    public void display() {
        System.out.println("Λεπτομέρειες κράτησης:");
    }

    public void setDetails(String newDetails) {
        manager.setDetails(newDetails);
        manager.EditConfirmationScreen();
        User.sendEmail();
    }

    public void cancelBooking() {
        manager.cancel();
        manager.SuccessfulCancellationScreen();
    }

    public void changeDay(String newDay) {
        boolean result = manager.setDay(newDay);
        if (!result) {
            manager.NoAvailableDayScreen();
        }
    }
}
