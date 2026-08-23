/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acer
 */
public class LoginManager {

    private static String currentUsername;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void setCurrentUser(String username) {
        currentUsername = username;
    }

    // Get the current username (to be used in other parts of the app)
    public static String getCurrentUser() {
        return currentUsername;
    }
    
}
