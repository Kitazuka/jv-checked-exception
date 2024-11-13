package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (null == password || password.length() < MIN_PASSWORD_LENGTH
                || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
