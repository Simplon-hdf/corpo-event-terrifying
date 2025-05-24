import java.util.*;
public class CollaboratorService implements CollaboratorInterface {
    private final List<Collaborator> collaborators;

    /**
     * Constructor of the class
     * */
    public CollaboratorService() {
        this.collaborators = new ArrayList<>();
    }

    /**
     * Method to create a collaborator by an admin
     * @param collab : a collaborator
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
     * @param collab : a collaborator
     * */
    public void deleteCollaborator(Collaborator collab){
        collaborators.remove(collab);
    }

    /**
     * Method to update a collaborator informations
     * @param collab : a collaborator
     */
    public void updateCollaborator(Collaborator collab){
        int index = collaborators.indexOf(collab);
        collaborators.set(index, collab);
    }

    public void showCollaborator(Collaborator collab){
        System.out.println(collab.getUserData());
    }

    /**
     * Method to show the list of collaborators
     */
    public void showCollaborators(){
        for (int i = 0; i < collaborators.size(); i++) {
            System.out.println("------------");
            showCollaborator(collaborators.get(i));
        }
    }
}
