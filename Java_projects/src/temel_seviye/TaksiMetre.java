package temel_seviye;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        double mesafe = input.nextDouble();
        double acılıs = 10;
        double km = 2.20;

        double tutar = acılıs + (mesafe * km);
        double sonuc = tutar > 20 ? tutar: 20;
        System.out.println(sonuc);
        input.close();

    }
    
}
