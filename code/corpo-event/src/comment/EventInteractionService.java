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

    


}
