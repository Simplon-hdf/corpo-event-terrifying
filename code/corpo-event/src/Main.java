public class Main {
    public static void main(String[] args) {
        CollaboratorService service = new CollaboratorService();
        Collaborator c1 = new Collaborator("Ali", "Baba", "ali@mail.com", "pass123", "E001", "C101", "Dev", "Axel");
        Collaborator c2 = new Collaborator("Sara", "Ben", "sara@mail.com", "pass456", "E002", "C102", "Tester", "Yousra");
        service.createCollaborator(c1);
        service.createCollaborator(c2);
        service.showCollaborators();
    }
}