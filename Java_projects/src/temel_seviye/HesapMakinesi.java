package temel_seviye;
import java.util.Scanner;


public class HesapMakinesi {
    public static void main(String[] args) {
    float n1,n2;
    Scanner input = new Scanner(System.in);

    System.out.println("enter the first number");
    n1 = input.nextFloat();


    System.out.println("enter the second number");
    n2 = input.nextFloat();  
    System.out.println("enter the 1 for sum,\n 2 for subtraction,\n 3 for multiplication,\n 4 for division");
    int choice = input.nextInt();
    switch(choice){
        case 1:
            System.out.println("sum of two numbers is " + (n1+n2));
            break;
        case 2:
            System.out.println("subtraction of two numbers is " + (n1-n2));
            break;
        case 3:
            System.out.println("multiplication of two numbers is " + (n1*n2));
            break;
        case 4:
            if(n2==0){
                System.out.println("division by zero is not possible");
                break;
            }else System.out.println("division of two numbers is " + (n1/n2));
            break;
        default:
            System.out.println("invalid choice");
    }
    input.close();
    }  
    
}
