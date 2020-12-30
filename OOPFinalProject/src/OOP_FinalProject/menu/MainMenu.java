package OOP_FinalProject.menu;

public class MainMenu {
    public static void main(String[] args) {
        if (LoginMenu.loginMenu()) {
            AthleteMenu.startMenu();
        }
    }
}
