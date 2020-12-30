package OOP_FinalProject.service;

import OOP_FinalProject.model.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    private static final Path databasePath = Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\databases.txt");
    private static final Scanner s = new Scanner(System.in);
    private static final UserService instance = new UserService();

    private UserService() {
    }

    public static UserService getInstance() {
        return instance;
    }

    public boolean login() {
        System.out.println("Enter your username");
        String username = s.nextLine();
        System.out.println("Enter your password");
        String password = s.nextLine();
        password = hashPassword(password);

        List<String> lines;
        try {
            lines = Files.readAllLines(databasePath);
        } catch (IOException e) {
            return false;
        }

        for (String line : lines) {
            //Full Name , Username, Email , password
            String[] fields = line.split(",");
            if (fields[1].equals(username) && fields[3].equals(password)) {
                System.out.println("Hi " + fields[0] + ". You have successfully signed in");
                return true;
            }
        }

        System.out.println("Please enter valid username and password to log in");
        return false;
    }

    public void register() {
        System.out.println("Enter your full name");
        String fullName = s.nextLine();
        System.out.println("Enter your username. Username length must be greater than 10");
        String username = s.nextLine();
        System.out.println("Enter your email");
        String email = s.nextLine();
        System.out.println("Enter your password. Password must contain 2 uppercase letters, 3 numbers and be longer than 10 symbols");
        String password = s.nextLine();

        String validation = validate(fullName, username, email, password);
        if (!validation.isEmpty()) {
            System.out.println(validation);
            return;
        }

        password = hashPassword(password);

        String data = String.join(",", fullName, username, email, password) + "\n";
        try {
            Files.write(databasePath, data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Please register again");
            return;
        }

        System.out.println("You have successfully registered. Please login into your account");
    }

    private Map<String, User> getAllUsers() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(databasePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, User> map = new HashMap<>();
        for (String line : lines) {
            //Full Name , Username, Email , password
            String[] fields = line.split(",");
            User user = new User(fields[0], fields[1], fields[2], fields[3]);
            map.put(user.getUserName(), user);
        }
        return map;
    }

    private String hashPassword(String password) {
        StringBuffer sb = new StringBuffer();
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private String validate(String fullName, String username, String email, String password) {
        if (!fullName.matches("[A-Z][a-z]+\\s+[A-Z][a-z]+")) {
            return "Full name is invalid. It must be of format `Name Surname`";
        }

        if (!(username.length() > 10)) {
            return "Username length must be greater than";
        }
        if (getAllUsers().containsKey(username)) {
            return "This username is occupied. Please enter another username";
        }

        if (!email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])")) {
            return "Invalid email. Please enter correct email";
        }

        if (!(password.length() > 8) || !password.matches("^(.*?[A-Z]){2,}.*$") ||
                !password.matches("^(.*?\\d){2,}.*$") || password.contains(" ")) {
            return "Invalid password. Password must contain 2 uppercase letters, 3 numbers, not contain space and be longer than 8 symbols";
        }

        return "";
    }
}
