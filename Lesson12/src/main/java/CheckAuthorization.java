import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CheckAuthorization {
    private String login;
    private String password;
    private String confirmPassword;

    public static void checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException, WrongPasswordConfirmException {

        boolean loginLength = login.length() <= 20;
        boolean passwordLength = password.length() <= 20;
        boolean equalsPasswords = password.equals(confirmPassword);
//      Tолько латинские буквы, цифры и знак подчеркивания.
        boolean isLogin = login.matches("[a-zA-Z_0-9]{5,20}");

        if (loginLength) {
            System.out.println("Все верно, логин меньше 20 символов!");
        } else {
            throw new WrongLoginException("Логин должен содержать до 20 символов!");
        }

        if (passwordLength) {
            System.out.println("Все верно, пароль меньше 20 символов!");
        } else {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов!");
        }

        if (equalsPasswords) {
            System.out.println("Пароли совпадают");
        } else {
            throw new WrongPasswordConfirmException("Пароли не совпадают!");
        }

        if (isLogin) {
            System.out.println("Логин норм");
        }
    }

}


