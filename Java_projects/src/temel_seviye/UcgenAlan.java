package temel_seviye;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kenara, kenarb, kenarc;
        System.out.print("1. Kenarı giriniz: ");
        kenara = input.nextDouble();
        System.out.print("2. Kenarı giriniz: ");
        kenarb = input.nextDouble();
        System.out.print("3. Kenarı giriniz: ");
        kenarc = input.nextDouble();
        double u = (kenara + kenarb + kenarc) / 2;
        double alan = Math.sqrt(u * (u - kenara) * (u - kenarb) * (u - kenarc));
        System.out.println("Üçgenin alanı: " + alan);
        input.close();
        
    }
    
}
