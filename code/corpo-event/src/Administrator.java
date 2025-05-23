import java.util.*;

public class Administrator extends User {
    private String administratorId;
    private int adminLevel;
    private List<String> permissions;

    public Administrator(String administratorId, int adminLevel, List<String> permissions, String firstName, String lastName, String mail, String password, String employeeNumber) {
        super(firstName,lastName,mail,password,employeeNumber);
        this.administratorId = administratorId;
        this.adminLevel = adminLevel;
        this.permissions = permissions;
    }

    /** Getters */
    public String getAdministratorId() {return administratorId;}
    public int getAdminLevel() {return adminLevel;}
    public List<String> getPermissions() {return permissions;}

    /** Setters */
    public void setAdministratorId(String administratorId) {this.administratorId = administratorId;}
    public void setAdminLevel(int adminLevel) {this.adminLevel = adminLevel;}
    public void setPermissions(List<String> permissions) {this.permissions = permissions;}
}
