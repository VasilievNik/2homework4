package com.company;

import java.io.*;
import java.util.Objects;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException, WrongLoginException, WrongPasswordException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String login = bufferedReader.readLine();
        if (!Pattern.matches("[a-zA-Z0-9_]+", login) || login.length()>20) {
            throw new WrongLoginException();
        }

        String password = bufferedReader.readLine();
        if (!Pattern.matches("[a-zA-Z0-9_]+", password) || password.length()>20) {
            throw new WrongPasswordException();
        }

        String confirmPassword = bufferedReader.readLine();
        if (!Objects.equals(confirmPassword, password)) {
            throw new WrongPasswordException();
        }

        a(login, password, confirmPassword);
    }

    public static void a(String login, String password, String confirmPassword){

    }
}




