import java.util.*;
public class EventService implements EventInterface{
    private final List<Event> events;

    /**
     * Constructor of the class
     * */
    public EventService() {
        this.events = new ArrayList<>();
    }

    /**
     * Method to create an event by an admin
     * @param event : an event
     * */
    public void createEvent(Event event){
        if(!events.contains(event)){
            events.add(event);
        }else{
            System.out.println("Event already exists");
        }
    }

    /**
     * Method to delete an event
     * @param event : an event
     * */
    public void deleteEvent(Event event){
        events.remove(event);
    }

    /**
     * Method to update an event informations
     * @param event : an event
     */
    public void updateEvent(Event event){
        int index = events.indexOf(event);
        events.set(index, event);
    }

    public void showEvent(Event event){
        System.out.println(event.getEventData());
    }

    /**
     * Method to show the list of events
     */
    public void showEvents(){
        for (int i = 0; i < events.size(); i++) {
            System.out.println("------------");
            showEvent(events.get(i));
        }
    }
}