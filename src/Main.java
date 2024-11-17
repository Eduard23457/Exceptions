import exceptions.WrongLoginException;
import exceptions.WrongPasswordExceptions;

public class Main {
    public static void main(String[] args) {

        String login = "login";
        String password = "qwe123";
        String confirmPassword = "qwe123";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Произошла ошибка при проверке логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordExceptions wrongPasswordExceptionExceptions) {
            System.out.println("Произощла ошибка при проверке пароля: " + wrongPasswordExceptionExceptions.getMessage());

        } finally {
            System.out.println("Валидация прошла успешно!");
        }
    }
}