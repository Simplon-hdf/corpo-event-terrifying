package user;
import java.util.*;

public class Administrator extends User {
    private String administratorId;
    private int adminLevel;
    private List<String> permissions;

    public Administrator(String firstName, String lastName, String mail, String password, String employeeNumber, String administratorId, int adminLevel, List<String> permissions) {
        super(firstName,lastName,mail,password,employeeNumber);
        this.administratorId = administratorId;
        this.adminLevel = adminLevel;
        this.permissions = permissions;
    }

    /** Getters */
    public String getAdministratorId() {return administratorId;}
    public int getAdminLevel() {return adminLevel;}
    public List<String> getPermissions() {return permissions;}
    public String getMoreData() {
        return getAdministratorId() + "\n" + getAdminLevel() + "\n" + getPermissions();
    }

    /** Setters */
    public void setAdministratorId(String administratorId) {this.administratorId = administratorId;}
    public void setAdminLevel(int adminLevel) {this.adminLevel = adminLevel;}
    public void setPermissions(List<String> permissions) {this.permissions = permissions;}
}
