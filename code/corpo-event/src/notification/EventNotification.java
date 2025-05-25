package event;
import java.time.LocalDateTime;

public class EventNotification {
    private String notificationTitle;
    private String notificationDescription;
    private LocalDateTime notificationDate;

    public EventNotification(String notificationTitle, String notificationDescription, LocalDateTime notificationDate) {
        this.notificationTitle = notificationTitle;
        this.notificationDescription = notificationDescription;
        this.notificationDate = notificationDate;
    }

    /** Getters**/
    public String getNotificationTitle() {return notificationTitle;}
    public String getNotificationDescription() {return notificationDescription;}
    public LocalDateTime getNotificationDate() {return notificationDate;}

    /** Setters**/
    public void setNotificationTitle(String notificationTitle) {this.notificationTitle = notificationTitle;}

    public void setNotificationDescription(String notificationDescription) {this.notificationDescription = notificationDescription;}

    public void setNotificationDate(LocalDateTime notificationDate) {this.notificationDate = notificationDate;}
}
