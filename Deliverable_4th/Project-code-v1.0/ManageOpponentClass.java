public class ManageOpponentClass {

    private List<String> opponentBookings;
    private List<String> participationForms;
    private String status;

    public ManageOpponent() {
        opponentBookings = new ArrayList<>();
        participationForms = new ArrayList<>();
        status = "pending";
    }

    public List<String> getOppBooking(){
        return opponentBookings;
    }

    public void getParticipationForm(String formInfo){
        ParticipationForm.add(formInfo);
    }
    
    public void changeStatus(String newStatus){
        this.status = newStatus;
    }
    
    public void getBookings(){}

    public boolean noResults(){
        return true;
    }

}
