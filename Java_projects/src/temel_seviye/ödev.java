package temel_seviye;
import java.util.Scanner;

public class ödev {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("enter your weight");
        weight = input.nextDouble();
        System.out.println("enter your height");
        height = input.nextDouble();
        bmi = weight/(height*height);
        System.out.println("your body mass index is: "+bmi);
        input.close();


    }
}
    
