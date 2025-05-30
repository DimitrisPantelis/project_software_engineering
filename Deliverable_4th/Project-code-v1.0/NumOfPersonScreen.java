public class NumOfPersonScreen {
    private ManagePerson manager = new ManagePerson();

    public void display() {
        System.out.println("Οθόνη επιλογής αριθμού ατόμων");
    }

    public void setNum(int num) {
        manager.setNumOfPersons(num);
    }
}
