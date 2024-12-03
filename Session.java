public class Session {
    // private fields
    private String user_name;
    private String password;
    private final String admin_pass = "admin123";
    private String status;

    // constructor
    public Session(String username, String password) {
        this.user_name = username;
        this.password = password;
        this.status = "offline";
    }

    // setter
    public void Submit() {
        if (user_name.equals("")) {
            System.out.println("User name cannot be empty");
        } else if (password.equals(admin_pass)) {
            System.out.println("Welcome " + user_name);
            status = "online";
        } else {
            System.out.println("Invalid Password");
        }
    }

    // getter
    public String session() {
        return status;
    }

}