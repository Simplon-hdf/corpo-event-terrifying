package comment;

import java.util.*;

public class EventInteractionService {
    private List<EventInteraction> eventInteractions;
    /** Constructor of the class */
    public EventInteractionService() { this.eventInteractions = new ArrayList<>(); }

    /**  Method to create a comment */
    public void createComment(EventInteraction comment){
        this.eventInteractions.add(comment);
    }

    /** Method to delete a comment */
    public void deleteComment(EventInteraction comment){
        this.eventInteractions.remove(comment);
    }

    /** Method to update a comment */
    public void updateComment(EventInteraction comment){
        int index = this.eventInteractions.indexOf(comment);
    }

}
