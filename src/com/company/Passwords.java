package com.company;

import java.util.Objects;

public class Passwords {

    private static void checkPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
                throw new WrongLoginException();
            }
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20 || !Objects.equals(confirmPassword, password)) {
                throw new WrongPasswordException();
            }
        }catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static boolean access(String login, String password, String confirmPassword){
        try {
            checkPassword(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}
