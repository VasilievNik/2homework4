package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        try (Scanner scanner=new Scanner(System.in)){

            String login = scanner.nextLine();
            String password = scanner.nextLine();
            String confirmPassword = scanner.nextLine();

            if(Passwords.access(login, password, confirmPassword)){
                System.out.format("Вы вошли в систему под логином: %s \nПароль: %s\n", login, password);
                System.out.println("Пароль подтвержден верно. Иначе быть и не могло...");
            }
        }
    }
}




