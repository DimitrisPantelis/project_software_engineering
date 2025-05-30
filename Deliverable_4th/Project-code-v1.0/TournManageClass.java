import java.util.List;

public class TournManageClass {
    private DataBaseManager db = new DataBaseManager();

    public List<String> getTournaments() {
        return db.queryTournaments();
    }

    public boolean submitTournamentChoice(int tournId, int userId) {
        return db.submitTournamentParticipation(tournId, userId);
    }

    public boolean addToNotificationList(int userId) {
        return db.addUserToTournamentNotifyList(userId);
    }

    public boolean checkIfAlreadyParticipated(int tournId, int userId) {
        return db.checkTournamentParticipation(tournId, userId);
    }

    public boolean checkTournamentDetails(Tournament tournament) {
        return tournament.getName() != null && tournament.getDate() != null;
    }

    public void NoAvailTournScreen() {
        System.out.println("No tournaments available.");
    }

    public void ParticipationTournament() {
        System.out.println("Thank you for participating.");
    }

    public void AlreadyPartScreen() {
        System.out.println("You are already registered in this tournament.");
    }
}
