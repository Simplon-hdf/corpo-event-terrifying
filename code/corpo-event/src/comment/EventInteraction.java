package comment;
import user.User;
import java.time.LocalDateTime;

public class EventInteraction {
    private String commentId ;
    private String commentContent ;
    private int commentLikes;
    private User commentAuthor;
    private LocalDateTime commentDate ;

    /** Constructor of the class **/
    public EventInteraction(String commentId, String commentContent, int commentLikes, User commentAuthor, LocalDateTime commentDate) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.commentLikes = commentLikes;
        this.commentAuthor = commentAuthor;
        this.commentDate = commentDate;
    }

    /** Getters **/
    public String getCommentContent() {return this.commentContent;}
    public int getCommentLikes() {return this.commentLikes;}
    public User getCommentAuthor() {return this.commentAuthor;}
    public LocalDateTime getCommentDate() {return this.commentDate;}

    /** Setters **/
    public void setCommentContent(String commentContent) {this.commentContent = commentContent;}
    public void setCommentLikes(int commentLikes) {this.commentLikes = commentLikes;}
    public void setCommentAuthor(User commentAuthor) {this.commentAuthor = commentAuthor;}
    public void setCommentDate(LocalDateTime commentDate) {this.commentDate = commentDate;}

    public String toString() {
        return "Comment : " + this.getCommentContent() + "\n"
                + "Likes : " + this.getCommentLikes() + "\n"
                + "Author : " + this.getCommentAuthor() + "\n"
                + "Date : " + this.getCommentDate();
    }


}
