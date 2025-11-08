import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        int atIndex = email.indexOf("@");

        if(atIndex == -1){
            System.out.println("Emails must contain @");
        }
        else{
            username = email.substring(0, atIndex);
            domain = email.substring(atIndex + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }

        scanner.close();

    }
}
