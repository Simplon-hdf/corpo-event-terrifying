import java.util.*;
public class CollaboratorService {
    private List<Collaborator> collaborators;
    public CollaboratorService() {
        this.collaborators = new ArrayList<>();
    }

    /**
     * Method to create a collaborator by an admin
     * @param {collab} : a collaborator
     * */
    public void createCollaborator(Collaborator collab){
        this.collaborators.add(collab);
    }
}
