package com.company;

import java.util.Objects;

public class Passwords {

    private static void checkPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException();
        }
        if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20 || !Objects.equals(confirmPassword, password)) {
            throw new WrongPasswordException();
        }
    }

    public static boolean access(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            checkPassword(login, password, confirmPassword);
            return true;
        }
       catch (NoSuchMethodError e){
           return false;
       }
    }
}
