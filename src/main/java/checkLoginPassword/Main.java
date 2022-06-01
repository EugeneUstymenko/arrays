package checkLoginPassword;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = in.next();
        System.out.print("Enter password: ");
        String password = in.next();
        System.out.print("Enter confirm password: ");
        String confirmPassword = in.next();

        boolean result = CheckCredentials.checkCredentials(login, password, confirmPassword);
        System.out.println("Result: " + result);
    }
}
