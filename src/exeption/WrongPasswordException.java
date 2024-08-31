package exeption;

public class WrongPasswordException extends RuntimeException {
    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password) {
        super(" Не корректный пароль ");
        this.password = password;
    }

    public WrongPasswordException(String password, String confirmPassword) {
        super(" Пароль не совпадает ");
        this.confirmPassword = confirmPassword;
        this.password = password;


    }
}
