package comment;

import java.util.*;

public class EventInteractionService {
    private final List<EventInteraction> eventInteractions;
    /** Constructor of the class **/
    public EventInteractionService() { this.eventInteractions = new ArrayList<>(); }

    /**
     * Method to create a comment
     * @param comment : a comment
     */
    public void createComment(EventInteraction comment){
        this.eventInteractions.add(comment);
    }

    /**
     * Method to delete a comment
     * @param comment : a comment 
     */
    public void deleteComment(EventInteraction comment){
        this.eventInteractions.remove(comment);
    }
}