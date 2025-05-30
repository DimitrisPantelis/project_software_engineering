import java.util.Scanner;

public class User {
    private int id;
    private String userType;
    private String username;
    private String email;
    private String password;
    private String phone;

    public User(int id, String userType, String username, String email, String password, String phone) {
        this.id = id;
        this.userType = userType;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String requestLocation() {
        System.out.println("Enter your location:\n");

        String location;

        Scanner scanLoc = new Scanner(System.in);
        location = scanLoc.nextLine();

        scanLoc.close();

        return location;
    }

    public int getId() {
        return id;
    }

    public String getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void sendEmail() {
        System.out.println("Sending email regarding your action.");
    }

}