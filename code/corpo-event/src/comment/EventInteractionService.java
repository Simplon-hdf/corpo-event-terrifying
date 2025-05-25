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

    /**
     * Method to update a comment
     * @param comment : a comment
     */
    public void updateComment(EventInteraction comment){
        int index = this.eventInteractions.indexOf(comment);
    }

    public void showComment(EventInteraction comment){
        System.out.println(comment.toString());
    }

    /** Method to show the list of comments */
    public void showComments(){
        for (int i = 0; i < eventInteractions.size(); i++) {
            System.out.println("------------");
            showComment(eventInteractions.get(i));
        }
    }
}