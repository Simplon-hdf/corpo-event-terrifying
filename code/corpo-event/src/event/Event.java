package event;
import java.time.LocalDateTime;

public class Event {
    private String eventId;
    private String eventTitle;
    private String eventDescription;
    private String eventLocation;
    private LocalDateTime eventDate;
    private int eventLikes;

    public Event(String eventId, String eventTitle, String eventDescription, String eventLocation, LocalDateTime eventDate, int eventLikes) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventDescription = eventDescription;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventLikes = eventLikes;
    }

    /** Getters**/
    public String getEventTitle() {return eventTitle;}
    public String getEventDescription() {return eventDescription;}
    public String getEventLocation() {return eventLocation;}
    public LocalDateTime getEventDate() {return eventDate;}
    public int getEventLikes() {return eventLikes;}
    public String getEventData() {
        return getEventTitle() + "\n" + getEventDescription() + "\n" + getEventLocation() + "\n" + getEventDate() + "\n" + getEventLikes();
    }

    /** Setters**/
    public void setEventTitle(String eventTitle) {this.eventTitle = eventTitle;}
    public void setEventDescription(String eventDescription) {this.eventDescription = eventDescription;}
    public void setEventLocation(String eventLocation) {this.eventLocation = eventLocation;}
    public void setEventDate(LocalDateTime eventDate) {this.eventDate = eventDate;}
    public void setEventLikes(int eventLikes) {this.eventLikes = eventLikes;}
}
