package OOP_FinalProject.menu;

import OOP_FinalProject.service.UserService;

import java.util.Scanner;

public class LoginMenu {
    private static final Scanner s = new Scanner(System.in);

    public static boolean loginMenu() {
        boolean flag = true;
        UserService userService = UserService.getInstance();
        while (flag) {
            System.out.println("Hi");
            System.out.println("------------------Login menu--------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    if (userService.login()) {
                        return true;
                    }
                    break;
                case 2:
                    userService.register();
                    break;
                case 3:
                    System.out.println("LoginMenu is closing,bye.");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
        return false;
    }
}
