package temel_seviye;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar = input.nextDouble();
        double kdvOran = tutar > 1000 ? 0.08 : 0.18;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        input.close();

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: %" + (kdvOran)*100);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}
