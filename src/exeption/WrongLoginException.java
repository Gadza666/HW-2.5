package exeption;

public class WrongLoginException extends RuntimeException {

    private String login;

    public WrongLoginException(String login) {
        super("Не корректный логин");
        this.login = login;
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

}
