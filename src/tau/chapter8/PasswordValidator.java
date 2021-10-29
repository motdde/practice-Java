package tau.chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;

    private boolean valid;

    private static final int MINIMUM_PASSWORD_LENGTH = 8;

    public PasswordValidator(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter current password");
        String currentPassword = input.nextLine();
        System.out.println("Enter new password");

        String password = input.nextLine();
        PasswordValidator validate = new PasswordValidator(username, currentPassword);
        boolean isValid = validate.changePassword(password);
        if (!isValid) {
            System.out.println("Validation failed");
        }
        input.close();
    }

    public boolean changePassword(String password) {
        valid = true;
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            valid = false;
            System.out.println("at least 8 characters long");
        }
        if (!checkUpperCase(password)) {
            valid = false;
            System.out.println("must contain an uppercase letter");
        }
        if (password.matches("[a-zA-Z0-9 ]*")) {
            valid = false;
            System.out.println("contains a special character");
        }
        if (password.toLowerCase().contains(username.toLowerCase())) {
            valid = false;
            System.out.println("not contains username");
        }
        if (password.toLowerCase() == currentPassword.toLowerCase()) {
            valid = false;
            System.out.println("not the same as old password");
        }
        return valid;
    }

    private static boolean checkUpperCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
