package Domain;

public class Staff {
    private String userName;
    private String password;

    public Staff(String userName, String password, String s) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {return userName;}
    public String getPassword() {return password;}
}
