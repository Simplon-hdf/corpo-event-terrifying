public class User {
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private String employeeNumber;
    private boolean isAuthenticated;

    User(String firstName, String lastName, String mail, String password, String employeeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.employeeNumber = employeeNumber;
        this.isAuthenticated = false;
    }

    /** Getters**/
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getMail() {return this.mail;}
    public String getEmployeeNumber() {return this.employeeNumber;}
    public boolean isAuthenticated() {return this.isAuthenticated;}

    /** Setters**/
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setMail(String mail) {this.mail = mail;}
    public void setEmployeeNumber(String employeeNumber) {this.employeeNumber = employeeNumber;}
    public void setAuthenticated(boolean isAuthenticated) {this.isAuthenticated = isAuthenticated;}
    public void setPassword(String password) {this.password = password;}
}

