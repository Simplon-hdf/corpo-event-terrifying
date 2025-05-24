import java.util.*;
public class AdministratorService implements AdministratorInterface{
    private final List<Administrator> administrators;

    /**
     * Constructor of the class
     * */
    public AdministratorService() {
        this.administrators = new ArrayList<>();
    }

    /**
     * Method to create an administrator by an admin
     * @param admin : a collaborator
     * */
    public void createAdministrator(Administrator admin){
        if(!administrators.contains(admin)){
            administrators.add(admin);
        }else{
            System.out.println("Collaborator already exists");
        }
    }

    /**
     * Method to delete an administrator
     * @param admin : an administrator
     * */
    public void deleteAdministrator(Administrator admin){
        administrators.remove(admin);
    }

    /**
     * Method to update an administrator informations
     * @param admin : an administrator
     */
    public void updateAdministrator(Administrator admin){
        int index = administrators.indexOf(admin);
        administrators.set(index, admin);
    }

    public void showAdministrator(Administrator admin){
        System.out.println(admin.getUserData());
    }

    /**
     * Method to show the list of administrator
     */
    public void showAdministrators(){
        for (int i = 0; i < administrators.size(); i++) {
            System.out.println("------------");
            showAdministrator(administrators.get(i));
        }
    }
}
