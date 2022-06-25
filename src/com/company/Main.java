package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        try (InputStream inputStream = System.in; Scanner scanner=new Scanner(inputStream)){

            String login = scanner.nextLine();
            String password = scanner.nextLine();
            String confirmPassword = scanner.nextLine();

            if(Passwords.access(login, password, confirmPassword)){
                System.out.format("Вы вошли в систему под логином: %s \nПароль: %s\n", login, password);
                System.out.println("Пароль подтвержден верно. Иначе быть и не могло...");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }
}




