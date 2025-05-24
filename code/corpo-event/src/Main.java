import event.EventService;
import user.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************Collaborators*********************");
        CollaboratorService collaboratorService = new CollaboratorService();
        Collaborator c1 = new Collaborator("Ali", "Baba", "ali@mail.com", "pass123", "E001", "C101", "Dev", "Jean");
        Collaborator c2 = new Collaborator("Sara", "Ben", "sara@mail.com", "pass456", "E002", "C102", "Tester", "Claire");
        collaboratorService.createCollaborator(c1);
        collaboratorService.createCollaborator(c2);
        System.out.println("List of Collaborators created : ");
        collaboratorService.showCollaborators();
        System.out.println();

        System.out.println("******************Administrators*********************");
        AdministratorService adminService = new AdministratorService();
        Administrator a1 = new Administrator("Jean", "Dupont", "jean.dupont@mail.com", "jdpass123", "E015", "C301", 2, Arrays.asList("READ", "CREATE"));
        Administrator a2 = new Administrator("Claire", "Martin", "claire.martin@mail.com", "clairepass", "E016", "C302", 3, Arrays.asList("READ", "UPDATE", "DELETE"));
        adminService.createAdministrator(a1);
        adminService.createAdministrator(a2);
        System.out.println("List of Administrators created : ");
        adminService.showAdministrators();
        System.out.println();

        System.out.println("**********************Events**************************");
        Event event1 = new Event("Team Building 2025", "Journée d’activités pour renforcer la cohésion", "Parc Floral de Paris", LocalDateTime.of(2025, 6, 15, 10, 0), 0);
        Event event2 = new Event("Conférence Tech Innov 2025", "Présentation des dernières innovations technologiques", "Centre des Congrès de Lyon", LocalDateTime.of(2025, 11, 20, 9, 30), 150);
        EventService eventService = new EventService();
        eventService.createEvent(event1);
        eventService.createEvent(event2);
        System.out.println("List of Events created : ");
        eventService.showEvents();
        System.out.println();
        System.out.println("=> Delete the  '" + event2.getEventTitle() + "' event");
        eventService.deleteEvent(event2);
        System.out.println("=> List of remaining events");
        eventService.showEvents();

    }
}