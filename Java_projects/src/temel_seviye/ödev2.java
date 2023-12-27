package temel_seviye;
import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        username = input.nextLine();

        System.out.println("enter your password");
        password = input.nextLine();
        
        if(username.equals("patika") && password.equals("java123")){
            System.out.println("login successful");
        }else{
            System.out.println("login failed");
            System.out.println("do you want to reset your password? (y/n)");
            String choice = input.nextLine();
            switch(choice){
                case "y":
                    System.out.println("enter your new password");
                    String newPassword = input.nextLine();
                    while(newPassword.equals("java123")){
                        System.out.println("password cannot be the same as the old one\nplease enter a new password");
                        newPassword = input.nextLine();
                    }
                    System.out.println("password changed successfully");
                    break;
                case "n":
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
        input.close();
    }
    
}
