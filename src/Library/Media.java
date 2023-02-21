package Library;

abstract public class Media {
    protected Boolean accessCard;
    protected String userName;

    public Media(Boolean accessCard, String userName) {
        this.accessCard = accessCard;
        this.userName = userName;
    }

    public void getUserName() {
        System.out.printf("User name = %s", userName);
    }

    abstract void accessRights();
}
