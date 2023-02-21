package Library;

public class Books extends Media{

    public Books(Boolean accessCard, String userName) {
        super(accessCard, userName);
    }

    @Override
    void accessRights() {
        System.out.printf("User name = %s have Books access rights%n", userName);
    }
}
