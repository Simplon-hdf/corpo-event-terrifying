public class Collaborator extends User {
    private String collaboratorId;
    private String jobTitle;
    private String supervisorName;

    public Collaborator(String firstName, String lastName, String mail, String password, String employeeNumber, String collaboratorId, String jobTitle, String supervisorName) {
    super(firstName, lastName, mail, password, employeeNumber);
    this.collaboratorId = collaboratorId;
    this.jobTitle = jobTitle;
    this.supervisorName = supervisorName;
    }

    /** Getters**/
    public String getCollaboratorId() {return collaboratorId;}
    public String getJobTitle() {return jobTitle;}
    public String getSupervisorName() {return supervisorName;}
    @Override
    public String getMoreData() {
        return getCollaboratorId() + "\n" + getJobTitle() + "\n" + getSupervisorName();
    }

    /** Setters**/
    public void setCollaboratorId(String collaboratorId) {this.collaboratorId = collaboratorId;}
    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}
    public void setSupervisorName(String supervisorName) {this.supervisorName = supervisorName;}
}
