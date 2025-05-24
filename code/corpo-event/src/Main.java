import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /** Collaborator**/
        CollaboratorService collaboratorService = new CollaboratorService();
        Collaborator c1 = new Collaborator("Ali", "Baba", "ali@mail.com", "pass123", "E001", "C101", "Dev", "Axel");
        Collaborator c2 = new Collaborator("Sara", "Ben", "sara@mail.com", "pass456", "E002", "C102", "Tester", "Yousra");
        collaboratorService.createCollaborator(c1);
        collaboratorService.createCollaborator(c2);
        collaboratorService.showCollaborators();

        /** Administrator**/
        AdministratorService adminService = new AdministratorService();
        Administrator a1 = new Administrator("Ali", "Baba", "ali@mail.com", "pass123", "E001", "C101", 5, Arrays.asList("READ", "UPDATE", "DELETE"));
        Administrator a2 = new Administrator("Sara", "Ben", "sara@mail.com", "pass456", "E002", "C102", 1, Arrays.asList("CREATE","READ", "UPDATE", "DELETE"));
        adminService.createAdministrator(a1);
        adminService.createAdministrator(a2);
        adminService.showAdministrators();
    }
}