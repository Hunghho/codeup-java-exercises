package Library;

public class Newspapers extends Media{

    public Newspapers(Boolean accessCard, String userName) {
        super(accessCard, userName);
    }

    @Override
    void accessRights() {
        System.out.printf("User name = %s have Newspapers access rights%n", userName);
    }
}
