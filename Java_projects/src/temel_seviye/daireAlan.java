package temel_seviye;
import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r,a,alan;
        System.out.println("enter the radius of the circle and the angle of the sector");
        r = input.nextFloat();
        a = input.nextFloat();
        alan = (float)(Math.PI*(r*r)*a)/360;
        System.out.printf("the area of the sector is: %f",alan)

    }
    
}
