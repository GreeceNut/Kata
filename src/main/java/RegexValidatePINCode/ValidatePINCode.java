package RegexValidatePINCode;

/**
 * ATM machines allow 4 or 6 digit PIN codes and
 * PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 */
public class ValidatePINCode {

    public static boolean validatePin(String pin) {

        if (pin.length() == 4 || pin.length() == 6) {
            return pin.matches("\\d+");

        }
        return false;
    }
}
