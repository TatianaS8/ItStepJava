package com.itstep.Lesson11;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        boolean done = false;
        do {
            System.out.println("Choose an option from the list:\n" +
                    "1. Add a new user\n" +
                    "2. Delete a user\n" +
                    "3. Check if the user exists\n" +
                    "4. Change the username of a user\n" +
                    "5. Change the password of a user");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    System.out.println("Add a username");
                    String username = scanner.nextLine();
                    System.out.println("Add a password");
                    String password = scanner.nextLine();

                    users.put(username, password);
                    System.out.println("Created user is " + username + " and password is:" + password);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter username you want to delete");
                    String userToDelete = scanner.nextLine();
                    users.remove(userToDelete);
                    System.out.println("You have been deleted " + userToDelete);
                    System.out.println("Existing users left are:" + users);
                    break;
                case 3:
                    System.out.println("Enter username");
                    String userNameToCheck = scanner.nextLine();
                    if (users.containsKey(userNameToCheck)) {
                        System.out.println("The user " + userNameToCheck + " is in the list");
                    } else {
                        System.out.println("User " + userNameToCheck + " doesn't exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter username you want to change");
                    String userNameToChange = scanner.nextLine();
                    if (users.containsKey(userNameToChange)){
                    System.out.println("Enter new UserName");
                    String newUserName = scanner.nextLine();
                        System.out.println("New user name is: " + newUserName);}
                    else {
                        System.out.println("User doesn t exist");}

                        break;

                case 5:
                    System.out.println("Enter a user name you want to change the password");
                    String userNameChangePassword = scanner.nextLine();
                    System.out.println("Enter the new password");
                    ;
                    String newPassword = scanner.nextLine();
                    users.replace(userNameChangePassword, users.get(userNameChangePassword), newPassword);
                    System.out.println("The password for:" + userNameChangePassword + "is: " + newPassword);

                    break;
                case 0:
                    System.out.println("Wrong insert");
                    done = true;
                    break;
                default:
                    System.out.println("Wrong nr.insert");
            }
        } while (!done);
    }
}


















