import java.util.*;
public class CollaboratorService {
    private final List<Collaborator> collaborators;

    /**
     * Constructor of the class
     * */
    public CollaboratorService() {
        this.collaborators = new ArrayList<>();
    }

    /**
     * Method to create a collaborator by an admin
     * @param {collab} : a collaborator
     * */
    public void createCollaborator(Collaborator collab){
        if(!collaborators.contains(collab)){
            collaborators.add(collab);
        }else{
            System.out.println("Collaborator already exists");
        }
    }

    /**
     * Method to delete a collaborator
     * @param {collab} : a collaborator
     * */
    public void deleteCollaborator(Collaborator collab){
        collaborators.remove(collab);
    }
}
