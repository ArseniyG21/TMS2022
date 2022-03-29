import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongPasswordConfirmException extends Exception {
    public WrongPasswordConfirmException(String message) {
        super(message);
    }
}
